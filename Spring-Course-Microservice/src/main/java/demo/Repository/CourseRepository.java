package demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.Entity.Course;

public interface CourseRepository extends  JpaRepository<Course, Integer> {

}
