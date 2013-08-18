package testapp.controllers;

import play.*;
import play.mvc.*;

import controllers.AssetsBuilder;
import play.api.mvc.AnyContent;
import play.api.mvc.Action;

import testapp.views.html.*;

public class Application extends Controller {
  
	private static AssetsBuilder delegate = new AssetsBuilder();

    public static Action<AnyContent> asset(String path, String file) {
        return delegate.at(path, file);
    }
    
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
}
