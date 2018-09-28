 package simpleTodoList;

import java.util.LinkedList;
import java.util.List;

public class ToDoList {
	
	private int id;
	private String name;
	private List<ToDo> todos = new LinkedList<ToDo>();
	
	

	public ToDoList() {}
	
	public ToDoList(String name) {
		this.name = name;
	}
	
	public void add(ToDo item) {
		item.setTodolist(this);
		todos.add(item);
		System.out.println(item.toString() + " Item successfully added to " + name + " list.");
	}
	
	public void createItemAndAdd(String desc) {
		ToDo item = new ToDo(desc);
		this.add(item);
	}
	
	public ToDo find(int num){
		ToDo item = todos.get(num - 1);
		return item;
	}
	
	public void transfer(ToDo item, ToDoList nextList) {
		item.complete();
		todos.remove(item);
		item.setTodolist(nextList);
		nextList.add(item);
		System.out.println(item.toString() + " Item successfully transfered from " + name + " to " + nextList.getName() + " list.");
	}
	
	public void listItems() {
		int counter = 0;
		System.out.println("Your " + name + " List:");
		for( ToDo item : todos ) {
			counter++;
			System.out.println(counter + ". " + item.toString());
		}
	}
	
	public boolean isEmpty() {
		return todos.isEmpty();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ToDo> getTodos() {
		return todos;
	}

	public void setTodos(List<ToDo> todos) {
		this.todos = todos;
	}


	

}
