package com.eventoapp.repository;

import com.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {

    Evento findById(long id);
}
