package CRMWebAPP.beans;

import org.springframework.stereotype.Service;

@Service
public class DevOps implements ICourse
{
	public DevOps()
	{
		System.out.println("DevOps bean created");
	}

	public Boolean getTheCourse(Double amount) {
		System.out.println("Enrolled in DevOps course and fees paid is "+ amount);
		return true;
	}


	
	

}
