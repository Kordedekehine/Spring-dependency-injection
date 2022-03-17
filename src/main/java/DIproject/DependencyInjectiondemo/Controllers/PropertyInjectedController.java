package DIproject.DependencyInjectiondemo.Controllers;

import DIproject.DependencyInjectiondemo.Services.GreetingService;
import DIproject.DependencyInjectiondemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller //We make this too a spring component
//if we run it directly like that we are liable to error,we have to tell spring to automatically inject that
public class PropertyInjectedController {

@Autowired
@Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

   public String sayHello(){
        return greetingService.sayGreeting();
    }

}
