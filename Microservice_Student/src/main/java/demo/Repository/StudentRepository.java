package demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import demo.Entity.Student;

public interface StudentRepository extends JpaRepository <Student , Integer> {

 
}