package it.prova.agenda.repository.agenda;

import org.springframework.data.repository.CrudRepository;

import it.prova.agenda.model.Agenda;


public interface AgendaRepository extends CrudRepository<Agenda, Long> {
	
}
