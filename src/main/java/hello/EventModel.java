package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


@ControllerAdvice
public class EventModel {
	
	@ModelAttribute("name")
	public String name(@Value("return this") String name){
		return name;
	}

}
