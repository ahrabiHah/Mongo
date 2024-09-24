package CRMWebAPP.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("dev")
@Profile("dev")  // This bean is only available in the "dev" profile
public class Telusko implements ICourse {

    public Telusko() {
        super();
        System.out.println("Telusko bean is created");
    }

    // Implement the logic directly within this method, no need to delegate to another ICourse
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Enrolled in Telusko course and fees paid is " + amount);
        return true;
    }
}
