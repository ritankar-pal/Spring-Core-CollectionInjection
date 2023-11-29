package in.ineuron.test;
import java.io.IOException;
import java.util.Date;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import in.ineuron.comp.College;



public class MainApp {

	public static void main(String[] args) {
		
//		
		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		//Application Context:: 
//		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		College std1 = factory.getBean("std1", College.class);
		System.out.println(std1);
		
		System.out.println();
		
		College std2 = factory.getBean("std2", College.class);
		System.out.println(std2);
		
	}

}
