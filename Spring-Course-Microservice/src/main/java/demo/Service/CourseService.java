package demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import demo.Entity.Course;
import demo.Repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repo;
	
	public Course get_One(int id) {
	 return	repo.findById(id).orElse(null);
		
	}
	
	public List<Course> get_All() {
		 return	repo.findAll();
	}
	
	public Course add_course(Course course)
	{
		 return	repo.save(course);
	}
	
	//public Course update_course(Course course) {
		//	Course c = repo.findById(course.getCourseId()).orElse(null);
			//c.setCourse_Name(course.getCourse_Name());
			//c.setCourseId(course.getCourseId());
			//c.setDuration(course.getDuration());
			//return repo.save(c);
	//}
	
//	public String delete_course(int id) {
	//	repo.deleteById(id);
//		return "Course deleted";
//	}
	
	
	
	

}
