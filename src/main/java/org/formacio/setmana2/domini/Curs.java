package org.formacio.setmana2.domini;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CURSOS")
public class Curs {
	@Id
	@Column(name="CUR_NOM")
	private String nom;
    @Column(name="CUR_EDATMINIMA")
	private int edatMinima;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdatMinima() {
		return edatMinima;
	}
	public void setEdatMinima(int edatMinima) {
		this.edatMinima = edatMinima;
	}
	
	
}
