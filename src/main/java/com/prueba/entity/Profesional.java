package com.prueba.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Profesional")
public class Profesional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String registro;

	@OneToMany(mappedBy = "profesional", cascade = CascadeType.ALL)
	public List<RegistroAccidente> registroAcc;
	
	@ManyToOne (fetch = FetchType.EAGER, optional=false)
	@JoinColumn (name = "persona_id", nullable=false)
	private Persona personaaa;

	public Profesional() {
	}

	public Profesional(Long id, String nombre, String registro, Set<RegistroAccidente> rAcc) {
		super();
		this.id = id;
		this.registro = registro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}	
	

	public Persona getPersonaaa() {
		return personaaa;
	}

	public void setPersonaaa(Persona personaaa) {
		this.personaaa = personaaa;
	}

	@Override
	public String toString() {
		return "Profesional [id=" + id + ",  registro=" + registro + "]";
	}

}
