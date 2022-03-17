package DIproject.DependencyInjectiondemo.Controllers;

import DIproject.DependencyInjectiondemo.Services.GreetingServiceImpl;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{ //A JUnit test is a method contained in a class which is only used for testing.
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test //A JUnit test is a method contained in a class which is only used for testing.
    public void testGreetings() throws Exception{
       assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
    //Asserts that two object arrays are equal. If they are not,
    // an AssertionError is thrown with the given message.
}
