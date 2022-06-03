package com.demo.repositories;

import com.demo.models.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition,Long> {
}
