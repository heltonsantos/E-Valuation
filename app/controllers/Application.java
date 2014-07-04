package controllers;

import models.entities.User;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	
//	final static Form<User> userForm = form(User.class);
	

    public static Result index() {
        return ok(index.render("E-Valuation"));
    }
    
    public static Result login() {
    	return ok(login.render("Login E-Valuation"));
    }

    public static Result logon() {
    	return redirect(routes.Application.home());
    }

    public static Result signIn() {
    	return ok(signin.render("Cadastro E-Valuation"));
    }
    
    public static Result home() {
    	return ok(home.render("E-Valuation"));
    }
    
    public static Result addUser() {
    	User user = Form.form(User.class).bindFromRequest().get();
    	user.save();
    	
    	return redirect(routes.Application.home());
    }
    
    public static Result pole() {
    	return ok(enquete.render("Enquete"));
    }
    
    public static Result newPole() {
    	return ok(novaEnquete.render("Nova Enquete"));
    }
    
    public static Result addPole() {
    	return TODO;
    }
    
    public static Result myPoles() {
    	return ok(minhasEnquetes.render("Minhas enquetes"));
    }
}
