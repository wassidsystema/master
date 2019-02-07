/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Help;



/**
*
* @author 211026298
*/
public interface JPAProcedures {
   public void createExercise();
   
   public void findDiscount(int numOfSeats, int discPercentage);
   
   public String insertTestValues();
   public String insertTestPart2Values() ;
}
