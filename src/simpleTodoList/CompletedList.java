package simpleTodoList;

public class CompletedList extends ToDoList {

	public CompletedList() {
		super();
	}
	
	@Override
	public void add(ToDo item) {
		list.add(item);
		System.out.println(item.toString() + " Item successfully added to Completed list.");
	}
	
	@Override
	public void listItems() {
		System.out.println("Your Completed Todos:");
		super.listItems();
	}

	

}
