package in.ineuron.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.College;
import in.ineuron.comp.ContactsInfo;



public class AdvancedBeanFactoryApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		College college = factory.getBean("clg", College.class);
		System.out.println(college);
		
		System.out.println();
		
		ContactsInfo contactsInfo = factory.getBean("contacts", ContactsInfo.class);
		System.out.println(contactsInfo);
		
		
		factory.close();
	}

}
