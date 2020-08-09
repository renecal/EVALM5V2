package com.prueba.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.prueba.security.Usuario;

@Entity
@Table (name="Persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private	String rut;	
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	
	private String email;
	@Column(nullable = false)
	private String telefono;
	@Column(nullable = false)
	private String sisPrevision;
	@Column(nullable = false)
	private String direccion;
	@Column(nullable = false)
	private String comuna;
	
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	public List<RegistroAccidente> registroAcc;
    
    @OneToMany(mappedBy = "personaa", cascade = CascadeType.ALL)
    public List<Usuario> user;
    
    @OneToMany(mappedBy = "personaaa", cascade = CascadeType.ALL)
    public List<Profesional> profesional;
	
	public Persona() {}
	
	public Persona(Long id, String nombre, String apellido, String email, String telefono, String sisPrevision
			) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.sisPrevision = sisPrevision;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSisPrevision() {
		return sisPrevision;
	}

	public void setSisPrevision(String sisPrevision) {
		this.sisPrevision = sisPrevision;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", sisPrevision=" + sisPrevision + "]";
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}



	
	
	
	
	
}
