package tn.pi.msrestapi.restapi;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.pi.msrestapi.daos.ToDoRepository;
import tn.pi.msrestapi.model.ToDo;

import java.util.List;

@RestController
@RequestMapping("/api/v0")
@RequiredArgsConstructor
public class ToDoRestcontroller {

    private final ToDoRepository toDoRepository;

    @GetMapping("/todos")
    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    @GetMapping("/todos/{id}")
    public ToDo findById(@PathVariable int id) {
        return toDoRepository.findById(id).orElse(null);
    }
    @PostMapping("/todos") public ToDo insertToDo(@RequestBody ToDo toDo) { return toDoRepository.save(toDo); }
}

