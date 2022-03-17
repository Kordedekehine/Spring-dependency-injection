package DIproject.DependencyInjectiondemo.Controllers;

import DIproject.DependencyInjectiondemo.Services.GreetingService;
import DIproject.DependencyInjectiondemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService; //Here we using the interface class


    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
    //Concerning the qualifier, if we have two spring beans waiting to be injected.The Spring won't automatically
    // know which one to inject,in this case,we use qualifier to key in the one to inject
    //By using the @Qualifier annotation, we can eliminate the issue of which bean needs to be injected.
}
