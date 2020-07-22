package com.galvanize.databse;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Long> {

    @Query(value="SELECT * FROM lessons WHERE title = :title", nativeQuery = true)   //nativeQuery forces SQL language
    Lesson findByTitle(String title); //title gets added to query
}
