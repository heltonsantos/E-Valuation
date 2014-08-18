package models.controllers;


import models.entities.User;
import play.db.ebean.Model;

public class UserController extends Model {

	public static Finder<Long, User> find = new Finder(Long.class, User.class);
	
	
	
	public void create(User user) {
		user.save();
	}
	
}
