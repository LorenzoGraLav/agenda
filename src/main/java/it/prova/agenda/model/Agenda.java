package it.prova.agenda.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "descrzione")
	private String descrzione;
	@Column(name = "dataorainizio")
	private LocalDateTime dataOraInizio;
	@Column(name = "dataorafine")
	private LocalDateTime dataOraFine;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "utente_id", nullable = false)
	private Utente utente;

	public Agenda() {
		super();
	}

	public Agenda(Long id, String descrzione, LocalDateTime dataOraInizio, LocalDateTime dataOraFine, Utente utente) {
		super();
		this.id = id;
		this.descrzione = descrzione;
		this.dataOraInizio = dataOraInizio;
		this.dataOraFine = dataOraFine;
		this.utente = utente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrzione() {
		return descrzione;
	}

	public void setDescrzione(String descrzione) {
		this.descrzione = descrzione;
	}

	public LocalDateTime getDataOraInizio() {
		return dataOraInizio;
	}

	public void setDataOraInizio(LocalDateTime dataOraInizio) {
		this.dataOraInizio = dataOraInizio;
	}

	public LocalDateTime getDataOraFine() {
		return dataOraFine;
	}

	public void setDataOraFine(LocalDateTime dataOraFine) {
		this.dataOraFine = dataOraFine;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}