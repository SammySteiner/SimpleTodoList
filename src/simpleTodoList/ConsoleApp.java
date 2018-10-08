package simpleTodoList;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ConsoleApp {
	
	public ConsoleApp() {
	}
	
	static void runConsoleApp(Session session) {
		// Welcome user
		// Show todo list
		// Prompt user for action
		// 1. add new item ('new')
		// 2. remove item ('complete')
		// 3. see completed items ('completed')
		// 4. see list again ('todos')
		// 5. quit application ('quit')
		// 6. see the list of actions ('help')
		
		session.beginTransaction();
		
//		Criteria criteria = session.createCriteria(ToDoList.class)
//				.add(Restrictions.eqOrIsNull("name", "Completed"));
//		
//		System.out.println(((ToDoList) criteria.list().get(0)).getTodos());
		
		Query query = session.createQuery("from ToDoList"); 
				
		ToDoList progress, completed;
		
		if(query.list().isEmpty()) {
			progress = new ToDoList("In Progress");
			completed = new ToDoList("Completed");			
		} else {
			progress = findTableByName("In Progress", query);
			completed = findTableByName("Completed", query);
		}

		session.save(progress);
		session.save(completed);
		session.getTransaction().commit();
		
		UserPrompt.welcome();
		UserPrompt.listToDos(progress, completed);
		UserInteraction ui = new UserInteraction(progress, completed, session);
		ui.interaction();
		
		session.beginTransaction();
		session.save(progress);
		session.save(completed);
		session.getTransaction().commit();
	}
	
	private static ToDoList findTableByName(String name, Query q) {
		ToDoList foundTDL = null;
		List<ToDoList> list = q.list();
		for (ToDoList tdl : list) {
			if (tdl.getName().equals(name)) {
				foundTDL = tdl;
			}
		}
		return foundTDL;
	}

}
