package com.codefirstgirls.spring.data.data_demo.repository;

import com.codefirstgirls.spring.data.data_demo.model.Otter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtterRepository extends JpaRepository<Otter, Long> {
}
