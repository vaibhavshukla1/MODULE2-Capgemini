

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

public class StoreData {
	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();

		if (factory != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			Employee em = new Employee();
			em.setFirstName("Vaibhav");
			em.setLastName("Shukla");
			session.save(em);

			tx.commit();
			session.close();

			ReadData();

		} else
			System.out.println("Session factory is null");

	}

	private static void ReadData() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee em = (Employee) session.get(Employee.class, 1);
		System.out.println(em.getFirstName());
		System.out.println(em.getLastName());
		tx.commit();
		session.close();

	}

}
