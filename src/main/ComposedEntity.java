import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity public abstract class ComposedEntity {
	@Embeddable public static abstract class ComposedId implements Serializable {
		@ManyToOne XEntity x;
		@ManyToOne YEntity y;
	}

	@Id ComposedId id;
}
