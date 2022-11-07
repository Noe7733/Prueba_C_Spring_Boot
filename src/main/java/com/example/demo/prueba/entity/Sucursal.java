package com.example.demo.prueba.entity;

import javax.persistence.*;

@Entity
@Table

public class Sucursal {

	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_S")
	public int id_s;
	
	@Column(name = "User_Id")
	public String user_id;
	
	//object business_hours
	
	@Column(name = "External_Id")
	public String external_id;
	
	//object location
	
	@Column(name = "Name")
	public String name;

	public Sucursal() {
		super();
	}
	
	public Sucursal(int Id_S, String User_Id, String External_Id, String Name) {
		super();
		this.id_s = Id_S;
		this.user_id = User_Id;
		this.external_id = External_Id;
		this.name = Name;
	}
	
	//getters y setters
	public int getId_s() {
		return id_s;
	}

	public void setId_s(int id_s) {
		this.id_s = id_s;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getExternal_id() {
		return external_id;
	}

	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}