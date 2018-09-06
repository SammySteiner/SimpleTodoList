package simpleTodoList;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ToDo {
	String description;
	LocalDateTime created, completed;
	
	// initialize with description
	public ToDo(String desc) {
		description = desc;
		LocalDateTime createdAt = LocalDateTime.now();
		created = createdAt;
	}
	
	// complete
	public void complete() {
		LocalDateTime completedAt = LocalDateTime.now();
		completed = completedAt;
	}
	
    // check if complete
	private String done() {
		return completed == null ? "not complete" : "complete";
	}
	
	// print
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMMM, d, YYYY");
		String createdAt = created.format(formatter);
		return description + " created on " + createdAt + " is " + this.done() + ".";
	}
	
}
