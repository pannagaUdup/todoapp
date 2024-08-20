package com.example.todoapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todoapp.Model.*;

@Repository
public interface TdaDao extends JpaRepository<task, Integer> {

}
