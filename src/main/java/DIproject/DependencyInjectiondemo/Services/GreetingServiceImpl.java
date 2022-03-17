package DIproject.DependencyInjectiondemo.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    //we implement the method class here
    public static final String HELLO_GURUS = "Hello Gurus!!!-Original"; //we declare an hello guru object


public String sayGreeting() { //we override the sayGreeting class here
    return HELLO_GURUS; //return Hello Gurus!!!
}
}
