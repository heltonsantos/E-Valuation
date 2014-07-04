package models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Answer extends Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	private String answer;
	private Date dateAnwsered;
	private long fk_Question;
	private long fk_User;

	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Date getDateAnwsered() {
		return dateAnwsered;
	}
	public void setDateAnwsered(Date dateAnwsered) {
		this.dateAnwsered = dateAnwsered;
	}
	public long getFk_Question() {
		return fk_Question;
	}
	public void setFk_Question(long fk_Question) {
		this.fk_Question = fk_Question;
	}
	public long getFk_User() {
		return fk_User;
	}
	public void setFk_User(long fk_User) {
		this.fk_User = fk_User;
	}
	public long getId() {
		return id;
	}

}
