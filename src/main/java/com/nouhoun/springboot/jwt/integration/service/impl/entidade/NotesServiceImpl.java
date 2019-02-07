/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Notes;
import com.nouhoun.springboot.jwt.integration.repository.entidade.NotesRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.NotesService;

@Service("notesService")
public class NotesServiceImpl implements NotesService {

	@Autowired
	private NotesRepository notesRepository;

	@Override
	public Notes updateNotes(Notes notes) {
		return notesRepository.save(notes);
	}

	@Override
	public Notes saveNotes(Notes notes) {
		return notesRepository.save(notes);
	}

	@Override
	public Notes findNotesById(Integer id) {
		return notesRepository.findNotesById(id);
	}

	@Override
	public List<Notes> findNotesAll(PaginationFilter filter) {
		return notesRepository.findAll();
	}

	@Override
	public Notes deleteNotes(Notes notes) {
		notesRepository.delete(notes);
		return notes;

	}

}
