 package simpleTodoList;

import java.util.LinkedList;

public abstract class ToDoList {
	
	LinkedList<ToDo> list = new LinkedList<ToDo>();
	
	public ToDoList() {}
	
	public void add(ToDo item) {}
	
	public ToDo find(int num){
		ToDo item = list.get(num - 1);
		return item;
	}
	
	public void complete(ToDo item, CompletedList completed) {
		item.complete();
		System.out.println(item.toString() + " Item successfully completed and removed from todo list.");
	}
	
	public void listItems() {
		int counter = 0;
		for( ToDo item : list ) {
			counter++;
			System.out.println(counter + ". " + item.toString());
		}
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	

}
