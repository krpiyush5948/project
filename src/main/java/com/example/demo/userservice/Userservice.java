package com.example.demo.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.usersdao.UsersDao;

@Service
public class Userservice {
	

	@Autowired UsersDao usersdao;
	
	public List<Users> getAllUsers() {
		 return usersdao.findAll();
	}

	public Object createUser( Users user) {
		// TODO Auto-generated method stub
		return usersdao.save(user);
	}
	
	public void deleteUSers( int id) {
		usersdao.deleteById(id);
	}

	public void deleteAllUser() {
		// TODO Auto-generated method stub
		usersdao.deleteAll();
		
	}

	public void updateusers( Users user,int id) {
		// TODO Auto-generated method stub
		    usersdao.findById(id);
		   usersdao.save(user);
		   
//		   if (!usersOptional.isPresent())
//				return .notFound().build();

		
	}
}
