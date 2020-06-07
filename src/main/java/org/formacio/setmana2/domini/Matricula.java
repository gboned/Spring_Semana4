package org.formacio.setmana2.domini;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_MATRICULES")
public class Matricula {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MAT_ID")
	private Long id; 
	@ManyToOne
	@JoinColumn(name="MAT_ALUMNE", referencedColumnName="ALU_NOM")
	private Alumne alumne;
	@ManyToOne
	@JoinColumn(name="MAT_CURS", referencedColumnName="CUR_NOM")
	private Curs curs;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Alumne getAlumne() {
		return alumne;
	}
	public void setAlumne(Alumne alumne) {
		this.alumne = alumne;
	}
	public Curs getCurs() {
		return curs;
	}
	public void setCurs(Curs curs) {
		this.curs = curs;
	}
	
	
}
