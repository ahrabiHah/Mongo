package CRMWebAPP;

import CRMWebAPP.beans.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmWebAppApplication implements CommandLineRunner {

    @Qualifier("dev")  // Inject the "dev" qualified bean
    @Autowired
    private ICourse course;

    public static void main(String[] args) {
        SpringApplication.run(CrmWebAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Boolean status = course.getTheCourse(5454.0);
        if (status) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
    }
}
