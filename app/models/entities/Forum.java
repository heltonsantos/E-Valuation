package models.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Forum extends Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private static long id;
	
	private Question question;
	private List<Answer> answers;
	private Date dateInit;

	private long fk_User;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public List<Answer> getAwnsers() {
		return answers;
	}

	public void setAwnsers(List<Answer> awnsers) {
		this.answers = awnsers;
	}

	public Date getDateInit() {
		return dateInit;
	}

	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}

	public long getFk_User() {
		return fk_User;
	}

	public void setFk_User(long fk_User) {
		this.fk_User = fk_User;
	}

	public static long getId() {
		return id;
	}

}
