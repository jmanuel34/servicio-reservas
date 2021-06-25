package com.cursoee.reservas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursoee.reservas.model.Reserva;
import com.cursoee.reservas.service.ReservasService;




@RestController
public class Controller {
@Autowired
ReservasService service;


	@PostMapping(value="reservar/{plazas}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void reservar(@RequestBody  Reserva reserva, @PathVariable("plazas") String plazas) {
		service.reservar(reserva, plazas);
	}
	
	// Solo visible para usuario administrador
	@GetMapping(value="reservas/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> reservas(@PathVariable("nombre") String nombre) {
		return service.consultar(nombre);		
	}

}
