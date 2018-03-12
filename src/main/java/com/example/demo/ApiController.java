package com.example.demo;

import com.example.demo.repo.VisitRepository;
import com.example.demo.repo.model.Visit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    final VisitRepository visitRepository;

    public ApiController(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @GetMapping("/visits")
    public Iterable<Visit> getVisits() {
        return visitRepository.findAll();
    }
}
