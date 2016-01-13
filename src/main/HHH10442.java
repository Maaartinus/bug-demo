import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class HHH10442 {
	public static void main(String[] args) throws Exception {
		final Configuration configuration = Helper.newConfiguration();
		try (final SessionFactory sessionFactory = configuration.buildSessionFactory()) {
			try (Session session = sessionFactory.openSession()) {
				session.createCriteria(ComposedEntity.class, "main")
				.createAlias("main.id.x", "x")
				.add(Restrictions.eq("x.id", Integer.valueOf(1)))
				.list();
			}
		}
	}
}
