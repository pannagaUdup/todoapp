package com.example.todoapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.todoapp.DAO.TdaDao;
import com.example.todoapp.Model.task;

import java.util.ArrayList;
import java.util.List;

@Service
public class TDA_Service {

    @Autowired
    TdaDao taskRepository;

    // public List<task> getAllTasks() {
    // return taskRepository.findAll();
    // }
    public ResponseEntity<List<task>> getAllTasks() {
        try {
            return new ResponseEntity<>(taskRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addTaskToDB(task getTask) {
        taskRepository.save(getTask);
        return new ResponseEntity<>("Succcesss", HttpStatus.CREATED);
    }
    // public Optional<task> getTaskById(Long id) {
    // return taskRepository.findById(id);
    // }

    // public task saveTask(task task) {
    // return taskRepository.save(task);
    // }

    // public void deleteTask(Long id) {
    // taskRepository.deleteById(id);
    // }
}
