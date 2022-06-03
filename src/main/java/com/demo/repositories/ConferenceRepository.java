package com.demo.repositories;

import com.demo.models.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository  extends JpaRepository<Conference,Long> {

}
