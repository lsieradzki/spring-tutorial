package spring.tutorial.db;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcDao {
	@Inject
	private JdbcTemplate template;

	public void query() {
		template.queryForObject("select * from dual", Long.class);
	}
}