import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


@MappedSuperclass public class SuperEntity {
	@Id @Generated(GenerationTime.INSERT) @GeneratedValue(strategy=GenerationType.SEQUENCE)
	Integer id;
}
