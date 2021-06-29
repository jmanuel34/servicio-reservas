package com.cursoee.reservas.service;

import java.util.List;

import com.cursoee.reservas.model.Reserva;

public interface ReservasService {
	boolean reservar(Reserva reserva, Integer plazas);
	List<Reserva> consultar (String hotel);

}
