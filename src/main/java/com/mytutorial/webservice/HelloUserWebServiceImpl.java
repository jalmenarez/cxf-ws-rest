package com.mytutorial.webservice;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
import com.mytutorial.pojo.User;
 
@Path("userservice/1.0")
@Produces("application/xml")
public class HelloUserWebServiceImpl implements HelloUserWebService {
 
 @GET
 @Path("/user/{userName}")
 public User greetUser(@PathParam("userName") String userName) {
  User user = new User();
  user.setName(userName);
  return user;
 }
 
}
