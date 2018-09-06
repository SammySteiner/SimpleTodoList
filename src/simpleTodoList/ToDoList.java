package simpleTodoList;

import java.util.LinkedList;

public class ToDoList {
	
	LinkedList<ToDo> todos = new LinkedList<ToDo>();
	LinkedList<ToDo> completed = new LinkedList<ToDo>();
	
// accept list of todo objects
// print list of todo objects
	
	public ToDoList() {
		
	}
	
	public void add(String desc) {
		ToDo item = new ToDo(desc);
		todos.add(item);
		System.out.println(item.toString() + " Item successfully added to Todo list.");
	}
	
	public void complete(int num) {
		ToDo item = todos.get(num - 1);
		item.complete();
		todos.remove(item);
		completed.add(item);
		System.out.println(item.toString() + " Item successfully completed and removed from todo list.");
	}
	
	public void listTodos() {
		int counter = 0;
		System.out.println("Your Todo List:");
		for( ToDo item : todos ) {
			counter++;
			System.out.println(counter + ". " + item.toString());
		}
	}
	
	public void listCompleted() {
		int counter = 0;
		System.out.println("Your Completed Todos:");
		for( ToDo item : completed ) {
			counter++;
			System.out.println(counter + ". " + item.toString());
		}
	}
	
	public boolean isEmpty() {
		return todos.isEmpty();
	}
	
	

}
