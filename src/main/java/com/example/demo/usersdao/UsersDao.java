package com.example.demo.usersdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Users;


@Repository
public interface UsersDao extends JpaRepository<Users,Integer> {

	
	

}
