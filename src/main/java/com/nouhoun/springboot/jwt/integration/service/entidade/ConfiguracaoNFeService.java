/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfiguracaoNFe;



public interface ConfiguracaoNFeService {


public ConfiguracaoNFe findConfiguracaoNFeById(Integer id);
public ConfiguracaoNFe saveConfiguracaoNFe(ConfiguracaoNFe configuracaonfe);
public ConfiguracaoNFe updateConfiguracaoNFe(ConfiguracaoNFe configuracaonfe);
public List<ConfiguracaoNFe> findConfiguracaoNFeAll(PaginationFilter filter);
public ConfiguracaoNFe deleteConfiguracaoNFe(ConfiguracaoNFe configuracaonfe);

}
