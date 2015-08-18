package hello;

public class Event {
	
	public String eventName = "meep";
	
	public int eventId = 42;

	public String getEventName() {
		return eventName;
	}
	
	public void setEventName(String eventName) {
		System.out.println("Event::Line 17:: String Eventname: " + eventName);
		this.eventName = eventName;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}		
}
