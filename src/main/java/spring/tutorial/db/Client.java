package spring.tutorial.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_clients")
public class Client {
	@Id
	@GeneratedValue
	private long id;
}
