/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Regime;



public interface RegimeService {


public Regime findRegimeById(Integer id);
public Regime saveRegime(Regime regime);
public Regime updateRegime(Regime regime);
public List<Regime> findRegimeAll(PaginationFilter filter);
public Regime deleteRegime(Regime regime);

}
