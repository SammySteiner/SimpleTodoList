package simpleTodoList;

import org.hibernate.Session;

public class SimpleTodoList {

	public static void main(String[] args) {
		
		InProgressList progress = new InProgressList();
		CompletedList completed = new CompletedList();
		
		// Welcome user
		// Show todo list
		// Prompt user for action
		// 1. add new item ('new')
		// 2. remove item ('complete')
		// 3. see completed items ('completed')
		// 4. see list again ('todos')
		// 5. quit application ('quit')
		// 6. see the list of actions ('help')
		
		UserPrompt.welcome();
		UserPrompt.listToDos(progress, completed);
		UserInteraction ui = new UserInteraction(progress, completed);
		ui.interaction();
		System.out.println("goodbye");
		
	
//		Session session = HibernateUtilities.getSessionFactory().openSession();
//		
//		session.beginTransaction();
//		ToDo todo = new ToDo("Commit something to a database.");
//		session.save(todo);
//		session.getTransaction().commit();
//		
//		session.beginTransaction();
//		ToDo loadedToDo = (ToDo) session.get(ToDo.class, 1);
//		System.out.println(loadedToDo.toString());
//		loadedToDo.complete();
//		System.out.println(loadedToDo.toString());
//		session.getTransaction().commit();
//		
//		session.close();
		
		
		
		

		
			}

}
