package spring.tutorial.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_client_addresses")
public class Address {
	@Id
	@GeneratedValue
	private long id;
	
	
}
