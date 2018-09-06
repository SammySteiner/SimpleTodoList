package simpleTodoList;

public class SimpleTodoList {

	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		UserPrompt.welcome();
		UserPrompt.listToDos(list);
		
		UserInteraction ui = new UserInteraction(list);
		ui.interaction();
		
		System.out.println("goodbye");
		
		// Welcome user
		// Show todo list
		// Prompt user for action
		// 1. add new item ('new')
		// 2. remove item ('complete')
		// 3. see completed items ('completed')
		// 4. see list again ('todos')
		// 5. quit application ('quit')
		// 6. see the list of actions ('help')
		
		
//		list.add("this is a test");
//		list.add("this is another test");
//		list.add("this is a final test");
//		
//		list.complete(1);
//		
//		list.listTodos();
//		list.listCompleted();
		
//		UserPrompt.instructions();
//		

//		
//		System.out.println("See ya later");
	}

}
