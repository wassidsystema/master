/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Notes;



public interface NotesService {


public Notes findNotesById(Integer id);
public Notes saveNotes(Notes notes);
public Notes updateNotes(Notes notes);
public List<Notes> findNotesAll(PaginationFilter filter);
public Notes deleteNotes(Notes notes);

}
