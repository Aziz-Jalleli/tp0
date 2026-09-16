package tn.pi.msrestapi.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pi.msrestapi.model.ToDo;
@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Integer> {

}
