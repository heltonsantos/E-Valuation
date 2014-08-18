package models.controllers;

import java.util.Date;
import java.util.List;

import models.entities.Question;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

public class QuestionController extends Model {
	
	public static Finder<Long, Question> find = new Finder(Long.class, Question.class);
	public static Finder<Date, Question> findByDate = new Finder(Date.class, Question.class);
	
	
	public void create(Question question) {
		question.save();
	}
	
	public List<Question> all() {
		return find.all();
	}

}
