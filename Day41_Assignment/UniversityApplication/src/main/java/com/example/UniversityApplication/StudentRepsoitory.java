package com.example.UniversityApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface StudentRepsoitory extends JpaRepository<Student, Integer> {

}
