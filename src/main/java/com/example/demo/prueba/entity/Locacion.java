package com.example.demo.prueba.entity;

import javax.persistence.*;

@Entity
@Table

public class Locacion {
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_L")
	public int id_l;
	
	@Column(name = "Street_Number")
	public String street_number;
	
	@Column(name = "Street_Name")
	public String street_name;
	
	@Column(name = "City_Name")
	public String city_name;
	
	@Column(name = "State_name")
	public String state_name;
	
	@Column(name = "Latitude")
	public int latitude;
	
	@Column(name = "Longitude")
	public int longitude;
	
	@Column(name = "Reference")
	public String reference;
	
	//constructores
	public Locacion() {
		super();
	}
	
	public Locacion(int Id_L, String Street_Number, String Street_Name, String City_Name, String State_Name, int Longitude, int Latitude, String Reference) {
		super();
		this.id_l = Id_L;
		this.street_number = Street_Number;
		this.street_name = Street_Name;
		this.city_name = City_Name;
		this.state_name = State_Name;
		this.latitude = Latitude;
		this.longitude = Longitude;
		this.reference = Reference;
	}
	
	//setteers y getters
	public int getId_l() {
		return id_l;
	}

	public void setId_l(int id_l) {
		this.id_l = id_l;
	}

	public String getStreet_number() {
		return street_number;
	}

	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
}