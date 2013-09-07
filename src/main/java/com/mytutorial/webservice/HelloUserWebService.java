package com.mytutorial.webservice;
 
import com.mytutorial.pojo.User;
 
public interface HelloUserWebService {
 //parameter that gets passed via the URL
 User greetUser(String userName);
}
