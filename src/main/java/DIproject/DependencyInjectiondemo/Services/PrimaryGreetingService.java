package DIproject.DependencyInjectiondemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//git branch -m main NoOneShouldComeHere
//        git fetch origin
//        git branch -u origin/NoOneShouldComeHere NoOneShouldComeHere
//
//git remote set-head origin -a
@Service
@Primary
@Profile({"en"})
//What the primary is stating now is that "if there's more than one bean,i will like to use this one here
//Yoo you can use the primary but once more than one is found in the whole package,it seizes to work
//That only one must be what we are focusing on
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello-Primary Greeting Service";
    }
}
