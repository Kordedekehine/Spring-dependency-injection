package DIproject.DependencyInjectiondemo.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SecondaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Mo wa lowo baba God";
    }
}
