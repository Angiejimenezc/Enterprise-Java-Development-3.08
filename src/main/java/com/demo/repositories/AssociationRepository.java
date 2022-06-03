package com.demo.repositories;

import com.demo.models.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository  extends JpaRepository<Association,Integer> {


}