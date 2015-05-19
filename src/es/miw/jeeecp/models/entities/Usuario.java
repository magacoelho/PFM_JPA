package es.miw.jeeecp.models.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints= @UniqueConstraint(columnNames = { "NAME" }))
public class Usuario implements Serializable {
	private static final long serialVersionUID = -3632602244844491316L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "TEMA")
	private String tema;
	@Column(name = "PREGUNTA")
	private String pregunta;

	//@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "tema")
	// @OneToMany(cascade = {CascadeType.ALL})
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Favorito> votos = new ArrayList<Favorito>();

	public Usuario(String tema, String pregunta) {
		this.tema = tema;
		this.pregunta = pregunta;
	}

	public Usuario() {
		super();
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Favorito> getVotos() {
		return votos;
	}

	public void setVotos(List<Favorito> votos) {
		this.votos = votos;
	}

	@Override
	public String toString() {
		return "Tema[" + id + ":" + tema + ":" + pregunta + ":" + votos + "]";
	}

	public boolean equals(Object obj) {
		Usuario other = (Usuario) obj;
		return getId().intValue() == other.getId().intValue();
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId().intValue();
		return result;
	}
}
