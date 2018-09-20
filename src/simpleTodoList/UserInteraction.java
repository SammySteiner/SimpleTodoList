package simpleTodoList;

import java.util.Scanner;

public class UserInteraction {
	InProgressList progress;
	CompletedList completed;
	Scanner sc = new Scanner(System.in);
	
	public UserInteraction() {}
	
	public UserInteraction(InProgressList progress, CompletedList completed) {
		this.progress = progress;
		this.completed = completed;
	}
		
	public void interaction() {
		while (sc.hasNext()) { 
			String action = sc.nextLine();
			switch(action) {
			case "new":
				System.out.println("What would you like to add to your list?");
				String addToDo = sc.nextLine();
				progress.createAndAdd(addToDo);
				progress.listItems();
				completed.listItems();
				break;
			case "complete":
				System.out.println("What number item would you like to remove from your list?");
				progress.listItems();
				int removeToDo = sc.nextInt();
				ToDo toDoToRemove = progress.find(removeToDo);
				progress.complete(toDoToRemove, completed);
				progress.listItems();
				completed.listItems();
				break;
			case "completed":
				completed.listItems();
				break;
			case "todos":
				progress.listItems();
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
