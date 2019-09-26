package com.example.demo.userscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.usersdao.UsersDao;
import com.example.demo.userservice.Userservice;

@RestController
public class Controller {
	
	
	@Autowired Userservice userservice;
	
	
// get users from db	
@RequestMapping("/get")
public List<Users> getUsersDeatils() {
	return userservice.getAllUsers();
}

// create users
@RequestMapping(value="/post",method=RequestMethod.POST)
public String postUserdetail(@RequestBody Users user)
{	 userservice.createUser(user);
	return "created";
   
}

// delete the user by id
@DeleteMapping(value="/del/{id}")
public String delete(@PathVariable int id) {
	
	userservice.deleteUSers(id);
	return "users deleted";
	
}

// delete all users
@DeleteMapping("/delete")
public String deleteAllUsers() {
	userservice.deleteAllUser();
	return "all deleted";
	
}

//update the user
@PutMapping(value="/update/{id}")
public String updateUSer(@RequestBody Users user,@PathVariable int id) {
	userservice.updateusers(user,id);
	return "updated";
	
	
	
}
 
}
