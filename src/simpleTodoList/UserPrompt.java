package simpleTodoList;

public class UserPrompt {
	 

	public static void welcome() {
		String welcomeMessage = "Welcome to the Simple Todo List App.";
		System.out.println(welcomeMessage);
	}
	
	public static void listToDos( InProgressList progress, CompletedList completed) {
		if (progress.isEmpty() && completed.isEmpty()) {
			System.out.println("There are no items in your todo list.");
			simpleInstructions();
		} else {
			if (!progress.isEmpty()) {
				progress.listItems();
			}
			if (!completed.isEmpty()) {
				completed.listItems();
			}
			simpleInstructions();
		}
	}
	
	public static void simpleInstructions() {
		String simple = "Create a new item with 'new' or ask for help with 'help'";
		System.out.println(simple);
	}
	
	public static void instructions() {
		String instructions = "Here's what you can do with the todo list:"
				+ "\n1. Enter 'new' to create a new todo item "
				+ "\n2. Enter 'complete' to check an item off"
				+ "\n3. Enter 'completed' to see your completed items"
				+ "\n4. Enter 'todos' to see your list of todo items"
				+ "\n5. Enter 'quit' to exit the application"
				+ "\n6. Enter 'help' to see this list of commands again";
		System.out.println(instructions);
	}

	
}
