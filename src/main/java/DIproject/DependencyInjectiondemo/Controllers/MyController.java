package DIproject.DependencyInjectiondemo.Controllers;

//we first create my controller class
import DIproject.DependencyInjectiondemo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller //We added controller to make it a spring component
public class MyController {
    //Before is just taking in hello. Now we want to refactor it to be taking in

//    @Bean
//    public String Hello(){ //then we added a method
//        System.out.println("Hello!!!"); //This is the beans that we shall be getting
//
//        return "foo";
//    }
    //Before

    //Now
    private GreetingService greetingService;

    public MyController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String Hello(){ //then we added a method
        System.out.println("Hello!!!"); //This is the beans that we shall be getting

        return greetingService.sayGreeting();
    }
}
