import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.MySQL5Dialect;


public class Helper {
	static Configuration newConfiguration() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		final Configuration configuration = new Configuration();


		configuration
		.setProperty("hibernate.connection.username", "root")
		.setProperty("hibernate.connection.password", "")
		.setProperty("hibernate.dialect", MySQL5Dialect.class.getName())
		.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/demo?createDatabaseIfNotExist=true")
		.setProperty("hibernate.hbm2ddl.auto", "create")
		.setProperty("hibernate.show_sql", "true")
		;
		configuration
		.addAnnotatedClass(SuperEntity.class)
		.addAnnotatedClass(XEntity.class)
		.addAnnotatedClass(YEntity.class)
		.addAnnotatedClass(ComposedEntity.class)
		;

		return configuration;
	}

}
