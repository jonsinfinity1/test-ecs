package com.jonsinfinity.testecs.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @GetMapping
    public ResponseEntity<List<String>> getToDoList() {

        return ResponseEntity.ok(Arrays.asList("ToDo Item 1", "ToDo Item 2", "ToDo Item 3"));
    }
}
