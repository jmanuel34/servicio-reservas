package com.cursoee.reservas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="reservas")
public class Reserva {
	@JsonProperty(value="idReserva")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idreserva;
	private String nombre;
	private String dni;
	private int hotel;
	private int vuelo;
	
	public Reserva() {
		super();
	}
	public Reserva(int idreserva, String nombre, String dni, int hotel, int vuelo) {
		super();
		this.idreserva = idreserva;
		this.nombre = nombre;
		this.dni = dni;
		this.hotel = hotel;
		this.vuelo = vuelo;
	}
	
	public int getIdreserva() {
		return idreserva;
	}
	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getHotel() {
		return hotel;
	}
	public void setHotel(int hotel) {
		this.hotel = hotel;
	}
	public int getVuelo() {
		return vuelo;
	}
	public void setVuelo(int vuelo) {
		this.vuelo = vuelo;
	}

}
