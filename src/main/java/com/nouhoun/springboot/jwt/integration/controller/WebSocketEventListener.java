package com.nouhoun.springboot.jwt.integration.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.nouhoun.springboot.jwt.integration.domain.ChatMessage;
import com.nouhoun.springboot.jwt.integration.domain.Jogo;
import com.nouhoun.springboot.jwt.integration.domain.Jogo.Processo;
import com.nouhoun.springboot.jwt.integration.domain.Jogo.Status;
import com.nouhoun.springboot.jwt.integration.domain.JogoPorData;
import com.nouhoun.springboot.jwt.integration.domain.JogoPorData.StatusJogoPorData;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.UserJogoData;
import com.nouhoun.springboot.jwt.integration.domain.UserJogoData.StatusUserJogoPorData;
import com.nouhoun.springboot.jwt.integration.service.JogoService;

/**
 * Created by rajeevkumarsingh on 25/07/17.
 */
@Component
public class WebSocketEventListener {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;
    
    @Autowired
	public JogoService jogoService;
    
    private FunctionsUtius data = new FunctionsUtius();

    @EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
        logger.info("Received a new web socket connection");
    }
    
    @Scheduled(initialDelay = 10000, fixedRate = 100000)
    public void run() {
    	
     	List<Jogo> jogos = jogoService.findJogoByStatus(Status.INDISPONIVEL, Processo.FINALIZAO) ;
    	List<Jogo> jogosClone = new ArrayList<Jogo>();
    	if(!jogos.isEmpty())
    	{
    		for (Jogo jogo : jogos) {
				GregorianCalendar gc = new GregorianCalendar();
				JogoPorData jogoPorData = jogoService.saveJogoPorData(new JogoPorData(data.shouldDownloadFile2(jogo.getDia(),gc,jogo.getHoraInicial()).getTime(),data.shouldDownloadFile2(jogo.getDia(),gc,jogo.getHoraFinal()).getTime(), jogo.getId(), jogo.getUsersJogo(), StatusJogoPorData.AJOGAR,jogo.getQuadraId()));
				jogo.setProcesso(Processo.GERADO);
				for (User usesr : jogo.getUsersJogo()) {
					jogoService.saveUserJogoData(new UserJogoData(usesr.getId(),jogoPorData.getId(),StatusUserJogoPorData.ACONFIRMAR));
				}
				jogosClone.add(jogo);
    		} 
    	
    		data.jogoService.saveJogo(jogosClone);
    	}
        logger.info("Current time is :: " + Calendar.getInstance().getTime());
        
        
    }

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());

        String username = (String) headerAccessor.getSessionAttributes().get("username");
        if(username != null) {
            logger.info("User Disconnected : " + username);

            ChatMessage chatMessage = new ChatMessage();
            chatMessage.setType(ChatMessage.MessageType.LEAVE);
            chatMessage.setSender(username);

            messagingTemplate.convertAndSend("/topic/public", chatMessage);
        }
    }
}
