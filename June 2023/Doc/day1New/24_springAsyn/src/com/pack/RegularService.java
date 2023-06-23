package com.pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service
public class RegularService {

@Autowired
private MailUtility mailUtility ;

public void registerUser(String userName){

System.out.println(" User registration for  "+userName +" complete");

mailUtility.sendMail(userName);

System.out.println(" Registration Complete. Mail will be send after 5 seconds ");
}

}