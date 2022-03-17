package DIproject.DependencyInjectiondemo.Controllers;

import DIproject.DependencyInjectiondemo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService; //we reference the interface here

    //Constructor based dependency injection do automatically Autowire themselves. So you don't need to add the annotation
    //However you can choose to autowire it by yourself...Not bad either

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        //the qualifier is going to accept the beans from the marked constructor class
        this.greetingService = greetingService; //we instantiate it here
    }

    public String sayHello(){
        return greetingService.sayGreeting(); //then we get its child..Hello gurus!!!
    }
}
