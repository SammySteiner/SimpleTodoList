package simpleTodoList;

import org.hibernate.Session;

public class SimpleTodoList {

	public static void main(String[] args) {
		
		System.out.println("Simple Todo List App open");
		Session session = HibernateUtilities.getSessionFactory().openSession();
		ConsoleApp.runConsoleApp(session);
		session.close();
		
//		session.beginTransaction();
//		ToDo loadedToDo = (ToDo) session.get(ToDo.class, 1);
//		System.out.println(loadedToDo.toString());
//		loadedToDo.complete();
//		System.out.println(loadedToDo.toString());
//		session.getTransaction().commit();
//		
		System.out.println("goodbye");		
			}
}
