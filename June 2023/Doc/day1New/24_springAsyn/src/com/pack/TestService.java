package com.pack;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestService {

public static void main(String args[]){

ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {
"beans.xml"});

RegularService regService = (RegularService) appContext.getBean("regularService");

regService.registerUser("seed Infotech");

}

}