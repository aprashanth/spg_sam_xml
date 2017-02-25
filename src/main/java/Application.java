import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spg.model.Customer;
import com.spg.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CustomerService service  = new CustomerServiceImpl();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = context.getBean("customerService", CustomerService.class);
		List<Customer> customers = service.findAll();
		
		System.out.println(customers.get(0).getFirstName());

	}

}
