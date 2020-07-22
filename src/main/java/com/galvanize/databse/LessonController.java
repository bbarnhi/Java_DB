package com.galvanize.databse;

import org.springframework.web.bind.annotation.*;

@RestController
public class LessonController {
    private final LessonRepository repository;

    public LessonController(LessonRepository repository){
        this.repository = repository;
    }

    @GetMapping("/all")
    public Iterable<Lesson> getAll(){
        return this.repository.findAll();
    }

    @PostMapping ("/save")
    public Lesson create(@RequestBody Lesson lesson){
        return this.repository.save(lesson);
    }

    @GetMapping("/by-title")
    public Lesson byTitle(@RequestParam("title") String title){
        return this.repository.findByTitle(title); //Calls method from LessonReposity class
    }
}