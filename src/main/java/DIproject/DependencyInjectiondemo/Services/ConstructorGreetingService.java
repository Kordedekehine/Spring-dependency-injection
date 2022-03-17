package DIproject.DependencyInjectiondemo.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{ //Let the new class implement the interface

    @Override //It overrides the GreetingService class-->Qualified at constructorInterjectedController
    public String sayGreeting() {
        return "Hello - This is a constructor greeting service";
    }
}
