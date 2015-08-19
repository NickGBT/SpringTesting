package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EventController {
	
	public int mappedvariable = 100;
	public int j;
	public String ifstatement;
	public Event e = new Event();
	public ArrayList<Event> eventList = new ArrayList<Event>();
	public ArrayList<String> arraylisttest = new ArrayList<String>();
	public ArrayList<Event> arraylisteventtest = new ArrayList<Event>();
	public int max = 100;
	public int min = 1;	
	Random random = new Random();
	public List<Integer> tokenList = new ArrayList<Integer>();

//    @RequestMapping("/event")
//    public String event() {
//        return "event";
//    }
    
    @ModelAttribute("mappedvariable")
    public int mappedvariable(){
    	j = 10;
    	mappedvariable = 10 * j;
    	return mappedvariable;
    }
	@RequestMapping("/event")
    @ModelAttribute("ifstatement")
    public String ifstatement(){
    	if(mappedvariable == 100){
    		ifstatement = "This Works";
    	}
    	else{
    		ifstatement = "This Does Not Work";
    	}
    	return ifstatement;
    }
    	
    @ModelAttribute("arraylisttest")
    public ArrayList<String> arraylisttest(){
    	if(mappedvariable == 100){
    		arraylisttest.add("this may work");
    		arraylisttest.add("if it does that'd be great");
    	}
    	else{
    		arraylisttest.add("if statement broke");
    	}
    	return arraylisttest;
    }
    
    @ModelAttribute("arraylisteventtest")
    public ArrayList<Event> arraylisteventtest(){
    	System.out.println("EventController::Line 63:: Array List Event Method Called");
    	if(mappedvariable == 100){
    		System.out.println("EventController::Line 65:: Mapped Variable equals 100");
    		e.setEventId(random.nextInt(max - min + 1) + min);
    		System.out.println("Event" + Integer.toString(random.nextInt(max - min + 1) + min));
    		e.setEventName("Event" + Integer.toString(random.nextInt(max - min + 1) + min));
    		e.setEventId(0);
    		arraylisteventtest.add(e);

    	}
    	else{
    		e.setEventId(random.nextInt(max - min + 1) + min);
    		e.setEventName("If statement broke");
    		arraylisteventtest.add(e);
    	}
    	return arraylisteventtest;
    }
    
    public void eventListSetter(){
    	for (int i = 10;i > 0; i--){
			e.setEventId(random.nextInt(max - min + 1) + min);
			System.out.println("Event" + Integer.toString(random.nextInt(max - min + 1) + min));
			e.setEventName("Event" + Integer.toString(random.nextInt(max - min + 1) + min));
			eventList.add(e);
    	}
    }
    

	@ModelAttribute("eventList")
	public ArrayList<Event> eventList(){
		eventListSetter();
		return eventList;
	}
	
	@ModelAttribute("tokenlist")
	public List<Integer> tokenList(){
		tokenList.add(1);
		tokenList.add(2);
		tokenList.add(3);
		return tokenList;
		
	}
	
//	@RequestMapping("/event")
//	@ModelAttribute("tokenlist")
//	public List<Integer> tokenList(){
//		tokenList.add(123);
//		tokenList.add(435);
//		return tokenList;
//	}

}