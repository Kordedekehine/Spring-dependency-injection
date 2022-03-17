package DIproject.DependencyInjectiondemo.Services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//Class is created to deal with or to get more than one bea+ns
@Service
public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello- I was injected via the constructor";
    }
}
