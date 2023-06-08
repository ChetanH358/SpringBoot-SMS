package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Student;


// first parameter is type of JPA entity i.e Student jpa entity
// second parameter is type of primary key
public interface StudentRepository extends JpaRepository<Student, Long>{
	//StudentRepositry gets all meathods needed to intreact with database
}
