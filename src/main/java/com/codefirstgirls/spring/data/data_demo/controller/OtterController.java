package com.codefirstgirls.spring.data.data_demo.controller;

import com.codefirstgirls.spring.data.data_demo.model.Otter;
import com.codefirstgirls.spring.data.data_demo.repository.OtterRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("otter")
public class OtterController {
    @Autowired
    private OtterRepository otterRepository;

    @GetMapping
    public List<Otter> getAllOtters() {
        return otterRepository.findAll();
    }

    @PostMapping
    public Otter createOtter(
            @RequestBody Otter otter
    ) {
        return otterRepository.save(otter);
    }
}
