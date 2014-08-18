package models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Question extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private static long id;
	
	private String course;
	private String subject;
	private String question;
	private String description;
	private long fk_user;
	
	
	public String getPergunta() {
		return question;
	}
	public void setPergunta(String pergunta) {
		this.question = pergunta;
	}
	public String getDescricao() {
		return description;
	}
	public void setDescricao(String descricao) {
		this.description = descricao;
	}
	public static long getId() {
		return id;
	}
	public long getFk_usuario() {
		return fk_user;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
