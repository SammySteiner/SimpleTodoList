package simpleTodoList;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class ToDo {
	private int id;
	private String description;
	private LocalDateTime created, completed;
	private ToDoList todolist;
	
	// initialize with description
	public ToDo() {
	}
	
	public ToDo(String desc) {
		setDescription(desc);
		LocalDateTime createdAt = LocalDateTime.now();
		setCreated(createdAt);
	}
	
	// complete
	public void complete() {
		LocalDateTime completedAt = LocalDateTime.now();
		setCompleted(completedAt);
	}
	
    // check if complete
	private String done() {
		return getCompleted() == null ? "not complete" : "complete";
	}
	
	// print
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMMM, d, YYYY");
		String createdAt = getCreated().format(formatter);
		return getDescription() + " created on " + createdAt + " is " + this.done() + ".";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getCompleted() {
		return completed;
	}

	public void setCompleted(LocalDateTime completed) {
		this.completed = completed;
	}

	public ToDoList getTodolist() {
		return todolist;
	}

	public void setTodolist(ToDoList todolist) {
		this.todolist = todolist;
	}
	
}
