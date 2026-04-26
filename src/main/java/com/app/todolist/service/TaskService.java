package com.app.todolist.service;

import com.app.todolist.model.Task;
import com.app.todolist.repositary.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private  final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task=new Task();
        task.setTitle(title);
        task.setStatus(false);
        taskRepository.save(task);
    }
}
