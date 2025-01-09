package br.com.jadson.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jadson.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
