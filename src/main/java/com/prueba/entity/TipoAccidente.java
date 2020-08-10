package com.prueba.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoAccidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String tAccidente;
	
	@OneToMany(mappedBy = "tipoAccidente", cascade = CascadeType.ALL)
	public List<RegistroAccidente> registroAcc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String gettAccidente() {
		return tAccidente;
	}
	public void settAccidente(String tAccidente) {
		this.tAccidente = tAccidente;
	}
	
	
}
