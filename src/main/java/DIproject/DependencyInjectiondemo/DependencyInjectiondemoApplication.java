package DIproject.DependencyInjectiondemo;

import DIproject.DependencyInjectiondemo.Controllers.ConstructorInjectedController;
import DIproject.DependencyInjectiondemo.Controllers.MyController;
import DIproject.DependencyInjectiondemo.Controllers.PropertyInjectedController;
import DIproject.DependencyInjectiondemo.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//Dependency Injection is where a needed dependency is added by another object
//DI should be done with interface..It allows runtime to decide which dependencies to inject
//Using private properties is evil

//IOC-Inversion of Control
//IOC is a technique that allows dependencies to be injected at the run time.This is because they are not
//predetermined

//Difference between the IOC and dependency injection
//Dependency injection refers to much of the composition of the classes
//IOC is the runtime of our code


@SpringBootApplication
public class DependencyInjectiondemoApplication {

	public static void main(String[] args) {
//Now that will going for application context,the method will return context for us to work with
		ApplicationContext within = SpringApplication.run(DependencyInjectiondemoApplication.class, args);

		//Then we do this to get a hold of bean,to get it spring will get it through lowercase character
		MyController myController = (MyController) within.getBean("myController");

		myController.Hello();

		System.out.println(myController.Hello());
		System.out.println(within.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(within.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(within.getBean(SetterInjectedController.class).sayHello());

	}

}
