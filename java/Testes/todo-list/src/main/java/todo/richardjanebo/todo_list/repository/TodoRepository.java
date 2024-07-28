package todo.richardjanebo.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import todo.richardjanebo.todo_list.entity.Todo;

public interface TodoRepository extends JpaRepository <Todo, Long> {

    
} 
