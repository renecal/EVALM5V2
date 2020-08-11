package com.prueba;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.entity.Persona;
import com.prueba.entity.Profesional;
import com.prueba.entity.RegistroAccidente;
import com.prueba.entity.TipoAccidente;

@SpringBootTest
class PruebaMod5V1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	   @Test
//	    @Transactional
//	    @Rollback(false)
//	    public void check() {
//		 
//			EntityManager entityManager = null;
//		   Persona p = new Persona();
//		   Profesional pro = new Profesional();
//		   TipoAccidente tipoA = new TipoAccidente();+0
//		   
//		   
//		   p.setNombre("dcadad");
//		   p.setApellido("gggg");
//		   p.setTelefono("fagagagag");
//		   p.setRut("14141414-1");
//		   p.setDireccion("gaghhgfafafaf");
//		   p.setEmail("gagag@gag.com");
//		   p.setSisPrevision("fonasa");
//		   
//		   
//		   pro.setRegistro("24242424");
//		   pro.setPersonaaa(p);
//		   
//		   tipoA.settAccidente("cacacaca");
//		   
//	        RegistroAccidente reg = new RegistroAccidente();
//	        reg.setDescripcion("Universidad de Las Palmas de Gran Canaria");
//	        reg.setCargo("");
//	        reg.setFecha("");
//	        reg.setPersona(p);
//	        reg.setProfesional(pro);
//	        reg.setTipoAccidente(tipoA);
//	        
//	    }

}
