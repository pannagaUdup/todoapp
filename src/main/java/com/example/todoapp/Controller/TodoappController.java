package com.example.todoapp.Controller;

import com.example.todoapp.Service.TDA_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.todoapp.Model.task;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TodoappController {

    @Autowired
    TDA_Service taskService;

    @GetMapping("alltdl")
    public ResponseEntity<List<task>> getAllQnsString() {
        return taskService.getAllTasks();
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody task addtask) {
        // TODO: process POST request
        return taskService.addTaskToDB(addtask);
    }
    // @GetMapping
    // public List<task> getAllTasks() {
    // return taskService.getAllTasks();
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<task> getTaskById(@PathVariable Long id) {
    // return taskService.getTaskById(id)
    // .map(task -> ResponseEntity.ok().body(task))
    // .orElse(ResponseEntity.notFound().build());
    // }

    // @PostMapping
    // public task createTask(@RequestBody task task) {
    // return taskService.saveTask(task);
    // }

    /*
     * @PutMapping("/{id}")
     * public ResponseEntity<task> updateTask(@PathVariable Long id, @RequestBody
     * task taskDetails) {
     * return taskService.getTaskById(id)
     * .map(task -> {
     * task.setTitle(taskDetails.getTitle());
     * task.setDescription(taskDetails.getDescription());
     * task.setCompleted(taskDetails.isCompleted());
     * Task updatedTask = taskService.saveTask(task);
     * return ResponseEntity.ok().body(updatedTask);
     * })
     * .orElse(ResponseEntity.notFound().build());
     * }
     * 
     * @DeleteMapping("/{id}")
     * public ResponseEntity<?> deleteTask(@PathVariable Long id) {
     * return taskService.getTaskById(id)
     * .map(task -> {
     * taskService.deleteTask(id);
     * return ResponseEntity.ok().build();
     * })
     * .orElse(ResponseEntity.notFound().build());
     * }
     */
}
