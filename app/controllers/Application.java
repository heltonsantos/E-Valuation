package controllers;

import static play.data.Form.form;

import com.avaje.ebean.Ebean;

import models.controllers.QuestionController;
import models.controllers.UserController;
import models.entities.Question;
import models.entities.User;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	
	final static Form<User> userForm = form(User.class);
	final static Form<Question> questionForm = form(Question.class);
	
	private static QuestionController questionControl;
	private static UserController userControl;

    public static Result index() {
        return ok(index.render("E-Valuation"));
    }
    
    public static Result deslogar() {
    	return redirect(routes.Application.index());
    }
    
    public static Result login() {
    	return ok(login.render("Login E-Valuation"));
    }

    public static Result logon() {
    	return redirect(routes.Application.home());
    }

    public static Result signIn() {
    	return ok(signin.render("Cadastro E-Valuation",userForm));
    }
    
    public static Result home() {
    	return ok(home.render("E-Valuation"));
    }
    
    public static Result addUser() {
//    	Form<Procedure> filledForm = procedureForm.bindFromRequest();
//    	Form<Contact> contactForm = form(Contact.class).bindFromRequest();
    	User newUser = userForm.bindFromRequest().get();
//    	user.save();
//    	Ebean.save(user);
    	userControl.create(newUser);
    	
    	
    	return redirect(routes.Application.home());
    }
    
    public static Result Question() {
    	return ok(enquete.render("Enquete"));
    }
    
    public static Result newQuestion() {
    	return ok(novaEnquete.render("Nova Enquete"));
    }
    
    public static Result addQuestion() {
    	Question newQuestion = questionForm.bindFromRequest().get();
//    	newQuestion.save();
    	questionControl.create(newQuestion);
    	
    	return redirect(routes.Application.myQuestions());
    }
    
    public static Result myQuestions() {
    	return ok(minhasEnquetes.render("Minhas enquetes"));
    }
}
