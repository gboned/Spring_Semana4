package org.formacio.setmana2.repositori;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.formacio.setmana2.domini.Alumne;
import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Service;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Service
public class RepositoriEscola {

	@PersistenceContext
	private EntityManager em;
	
	public Curs carregaCurs(String nom) {
		return em.find(Curs.class, nom);
	}

	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
		Matricula nova = new Matricula();
		Alumne datosAlumno = em.find(Alumne.class, alumne);
		Curs datosCurso = em.find(Curs.class, curs);
		nova.setAlumne(datosAlumno);
		nova.setCurs(datosCurso);
		if (datosAlumno.getEdat() < datosCurso.getEdatMinima()) {
			throw new EdatIncorrecteException();
		} else {
			em.persist(nova);
			return nova;
	}
	}
	
}
