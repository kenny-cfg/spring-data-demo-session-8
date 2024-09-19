package com.codefirstgirls.spring.data.data_demo.controller;

import com.codefirstgirls.spring.data.data_demo.model.Otter;
import com.codefirstgirls.spring.data.data_demo.repository.OtterRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("otter")
public class OtterController {
    @Autowired
    private OtterRepository otterRepository;

    @GetMapping
    public ResponseEntity<Collection<Otter>> getAllOtters() {
        val otters = otterRepository.findAll();
        return ResponseEntity.ok(otters);
    }
}
