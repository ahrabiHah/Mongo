package CRMWebAPP.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("SpringBoot")
public class SpringBoot implements ICourse
{
	
	public SpringBoot()
	{
		System.out.println("SpringBoot bean created");
	}

	public Boolean getTheCourse(Double amount) {
		System.out.println("Enrolled in SpringBoot course and fees paid is "+ amount);
		return true;
		
	}

	

}
