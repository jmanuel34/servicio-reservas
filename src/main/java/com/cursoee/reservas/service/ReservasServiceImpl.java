package com.cursoee.reservas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cursoee.reservas.dao.ReservasRepository;
import com.cursoee.reservas.model.Hotel;
import com.cursoee.reservas.model.Reserva;
@Service
public class ReservasServiceImpl implements ReservasService {
	@Autowired
	ReservasRepository repository;
	/*
	 * Interaccion con el servicio de vuelos
	 */
	@Autowired
	RestTemplate template;
	String urlVuelos="http://servicio-vuelos";
	String urlHoteles="http://servicio-hoteles";
	



	@Override
	public boolean reservar(Reserva reserva, String plazas) {
		
		// Podria ser necesaria la interaccion con servicio-vuelos y servicio-hoteles
		// La reserva viene con idVuelo e idHotel y cantidad de personas
		// para reservar en los hoteles
		
//		template.put(urlVuelos+"/reserva/{idVuelo}{plazas}", null, reserva.getVuelo(), plazas);
		template.put("http://localhost:7008/reserva/{idVuelo}{plazas}", null, reserva.getVuelo(), plazas);
		repository.save(reserva);
		return true;
	}

	@Override
	public List<Reserva> consultar(String hotel) {	
//		Hotel h=template.getForObject(urlHoteles+"/hotel/{hotel}", Hotel.class, hotel); 
		Hotel h=template.getForObject("http://localhost:7007/hotel/{hotel}", Hotel.class, hotel);
		Integer idHotel= h.getIdHotel();
		return repository.findByHotel(idHotel);
	}

}
