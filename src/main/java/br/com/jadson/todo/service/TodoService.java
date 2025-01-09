package br.com.jadson.todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.jadson.todo.entity.Todo;
import br.com.jadson.todo.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return read();
    }
    public List<Todo> read(){
        Sort sort = Sort.by("priority").descending().and(
            Sort.by("name").ascending()
        );
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return read();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return read();
    }
}
