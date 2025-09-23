package pt.com.GuiFcosta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.com.GuiFcosta.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
