package br.com.jadson.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = (long) 0;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private boolean realized;
    private int priority;

    public Todo(){

    }
    public Todo(Long id, String name, String description, boolean realized, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }
    public Todo(String name, String description, boolean realized, int priority) {
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isRealized() {
        return realized;
    }
    public void setRealized(boolean realized) {
        this.realized = realized;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
