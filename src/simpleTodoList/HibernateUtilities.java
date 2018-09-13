package simpleTodoList;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateUtilities {

private static SessionFactory sessionFactory;
private static ServiceRegistry serviceRegistry;

static {
	try {
		Configuration configuration = new Configuration().configure();
		
		serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	} catch(HibernateException exception) {
		System.out.println("Problem creating session factory.");
		exception.printStackTrace();
	}
}

public static SessionFactory getSessionFactory() {
	return sessionFactory;
}
}
