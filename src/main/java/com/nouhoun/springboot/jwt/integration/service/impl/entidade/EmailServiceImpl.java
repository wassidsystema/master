/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Email;
import com.nouhoun.springboot.jwt.integration.repository.entidade.EmailRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.EmailService;

@Service("emailService")
public class EmailServiceImpl implements EmailService {

	@Autowired
	private EmailRepository emailRepository;

	@Override
	public Email updateEmail(Email email) {
		return emailRepository.save(email);
	}

	@Override
	public Email saveEmail(Email email) {
		return emailRepository.save(email);
	}

	@Override
	public Email findEmailById(Integer id) {
		return emailRepository.findEmailById(id);
	}

	@Override
	public List<Email> findEmailAll(PaginationFilter filter) {
		return emailRepository.findAll();
	}

	@Override
	public Email deleteEmail(Email email) {
		emailRepository.delete(email);
		return email;

	}

}
