package $package;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main{
	public static void main(String[] args){
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
		System.out.println(jdbcTemplate.queryForList("SELECT * FROM table1"));
		ctx.close();
	}
}