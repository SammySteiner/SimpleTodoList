package simpleTodoList;

import java.util.Scanner;

public class UserInteraction {
	ToDoList todos;
	Scanner sc = new Scanner(System.in);
	
	public UserInteraction(ToDoList list) {
		todos = list;
	}
		
	public void interaction() {
		while (sc.hasNext()) { 
			String action = sc.nextLine();
			switch(action) {
			case "new":
				System.out.println("What would you like to add to your list?");
				String addToDo = sc.nextLine();
				todos.add(addToDo);
				todos.listTodos();
				todos.listCompleted();
				break;
			case "complete":
				System.out.println("What number item would you like to remove from your list?");
				todos.listTodos();
				int removeToDo = sc.nextInt();
				todos.complete(removeToDo);
				todos.listTodos();
				todos.listCompleted();
				break;
			case "completed":
				todos.listCompleted();
				break;
			case "todos":
				todos.listTodos();
				break;
			case "help":
				UserPrompt.instructions();
				break;
			case "quit":
				sc.close();
				return;
			default:
				System.out.println(action + " is not a recognized command. For a list of commands, type 'help'");
				break;
			}
		}	
	}
}
