/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.ModelDTO.Action;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Configuracao;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Email;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Endereco;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Entidade;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Regime;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Socio;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Telefone;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfiguracaoRepository;
import com.nouhoun.springboot.jwt.integration.repository.entidade.EmailRepository;
import com.nouhoun.springboot.jwt.integration.repository.entidade.EnderecoRepository;
import com.nouhoun.springboot.jwt.integration.repository.entidade.EntidadeRepository;
import com.nouhoun.springboot.jwt.integration.repository.entidade.RegimeRepository;
import com.nouhoun.springboot.jwt.integration.repository.entidade.SocioRepository;
import com.nouhoun.springboot.jwt.integration.repository.entidade.TelefoneRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.EntidadeService;

@Service("entidadeServices")
public class EntidadeServiceImpl implements EntidadeService {

	@Autowired
	private EntidadeRepository entidadeRepository;

	@Autowired
	private RegimeRepository regimeRepository;

	@Autowired
	private ConfiguracaoRepository configuracaoRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private EmailRepository emailRepository;

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private SocioRepository socioRepository;

	@Override
	public Entidade updateEntidade(Entidade entidade) {

		return SaveEntidade(entidade, false);
	}

	@Override
	public Entidade saveEntidade(Entidade entidade) {
		return SaveEntidade(entidade, false);
	}

	@Override
	public Entidade findEntidadeById(Integer id) {
		return entidadeRepository.findEntidadeById(id);
	}

	@Override
	public Entidade findEntidadeByUserId(Integer id) {
		return entidadeRepository.findEntidadeByUserId(id);

	}

	@Override
	public List<Entidade> findEntidadeAll(PaginationFilter filter) {
		return entidadeRepository.findAll();
	}

	@Override
	public Entidade deleteEntidade(Entidade entidade) {
		return SaveEntidade(entidade, true);

	}

	private Entidade SaveEntidade(Entidade entidade, Boolean delete) {
		if (entidade.getRegime() != null) {
			if (entidade.getRegime().getModelAction().toString().equals(Action.INSERT.toString())
					|| (entidade.getRegime().getModelAction().toString().equals(Action.UPDATE.toString()))) {
				Regime regime = regimeRepository.save(entidade.getRegime());

				entidade.setRegimeId(regime.getId());
			} else if (entidade.getRegime().getModelAction().toString().equals(Action.DELETE.toString())) {
				regimeRepository.delete(entidade.getRegime());
				entidade.setRegimeId(null);
			}
		}

		if (entidade.getConfiguracao() != null) {
			if (entidade.getConfiguracao().getModelAction().toString().equals(Action.INSERT.toString())
					|| (entidade.getConfiguracao().getModelAction().toString().equals(Action.UPDATE.toString()))) {
				Configuracao conf = configuracaoRepository.save(entidade.getConfiguracao());
				entidade.setConfiguracaoId(conf.getId());
			} else if (entidade.getConfiguracao().getModelAction().toString().equals(Action.DELETE.toString())) {
				configuracaoRepository.delete(entidade.getConfiguracao());
				entidade.setConfiguracaoId(null);
			}
		}
		Entidade ent = entidade;
		if (delete) {
			entidadeRepository.delete(ent);
		} else {
			ent = entidadeRepository.save(entidade);

		}

		if ((entidade.getEnderecos() != null) && (entidade.getEnderecos().size() > 0)) {
			for (Endereco endereco : entidade.getEnderecos()) {
				endereco.setEntidadeId(ent.getId());
				if (endereco.getModelAction().toString().equals(Action.INSERT.toString())
						|| (endereco.getModelAction().toString().equals(Action.UPDATE.toString()))) {
					enderecoRepository.save(endereco);
				} else if (endereco.getModelAction().toString().equals(Action.DELETE.toString())) {
					enderecoRepository.delete(endereco);
				}
			}
		}

//		if ((entidade.getDocumentos() != null) && (entidade.getDocumentos().size() > 0)) {
//			for (Documento documento : entidade.getDocumentos()) {
//				documento.setEntidadeId(ent.getId());
//				if (documento.getModelAction().toString().equals(Action.INSERT.toString())
//						|| (documento.getModelAction().toString().equals(Action.UPDATE.toString()))) {
//					documentoRepository.save(documento);
//				} else if (documento.getModelAction().toString().equals(Action.DELETE.toString())) {
//					documentoRepository.delete(documento);
//				}
//			}
//		}

		if ((entidade.getEmails() != null) && (entidade.getEmails().size() > 0)) {
			for (Email email : entidade.getEmails()) {
				email.setEntidadeId(ent.getId());
				if (email.getModelAction().toString().equals(Action.INSERT.toString())
						|| (email.getModelAction().toString().equals(Action.UPDATE.toString()))) {
					emailRepository.save(email);
				} else if (email.getModelAction().toString().equals(Action.DELETE.toString())) {
					emailRepository.delete(email);
				}
			}
		}

		if ((entidade.getTelefones() != null) && (entidade.getTelefones().size() > 0)) {
			for (Telefone telefone : entidade.getTelefones()) {
				telefone.setEntidadeId(ent.getId());
				if (telefone.getModelAction().toString().equals(Action.INSERT.toString())
						|| (telefone.getModelAction().toString().equals(Action.UPDATE.toString()))) {
					telefoneRepository.save(telefone);
				} else if (telefone.getModelAction().toString().equals(Action.DELETE.toString())) {
					telefoneRepository.delete(telefone);
				}
			}
		}

		if ((entidade.getSocios() != null) && (entidade.getSocios().size() > 0)) {
			for (Socio socio : entidade.getSocios()) {
				socio.setEntidadeId(ent.getId());
				if (socio.getModelAction().toString().equals(Action.INSERT.toString())
						|| (socio.getModelAction().toString().equals(Action.UPDATE.toString()))) {
					socioRepository.save(socio);
				} else if (socio.getModelAction().toString().equals(Action.DELETE.toString())) {
					socioRepository.delete(socio);
				}
			}
		}
		return ent;
	}

}
