package com.example.demo.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="userdetails")
public class Users {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)    
	 @Basic(optional = false)    @Column(name = "id",unique=true, nullable = false)
	private Integer Id;
	private String name;
	private int age;
	
	
	public Users() {
		
	}

	public Users(int Id, String name, int age) {
		super();
		this.Id = Id;
		this.name = name;
		this.age = age;
	}
	
	public int getUserId() {
		return Id;
	}
	public void setUserId(int userId) {
		this.Id = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
