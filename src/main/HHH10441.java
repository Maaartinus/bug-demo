import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HHH10441 {
	public static void main(String[] args) throws Exception {
		final Configuration configuration = Helper.newConfiguration();
		try (final SessionFactory sessionFactory = configuration.buildSessionFactory()) {
		}
	}
}
