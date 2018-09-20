package simpleTodoList;

public class InProgressList extends ToDoList{

	public InProgressList() {
		super();
	}
	
	@Override
	public void add(ToDo item) {
		list.add(item);
		System.out.println(item.toString() + " Item successfully added to Todo list.");
	}
	
	@Override
	public void listItems() {
		System.out.println("Your Todo List:");
		super.listItems();
	}
	
	public ToDo create(String desc) {
		ToDo item = new ToDo(desc);
		return item;
	}
	
	public void createAndAdd(String desc) {
		ToDo item = this.create(desc);
		this.list.add(item);			
	}
	
	@Override
	public void complete(ToDo item, CompletedList completed) {
		super.complete(item, completed);
		list.remove(item);
		completed.add(item);
	}
	

}
