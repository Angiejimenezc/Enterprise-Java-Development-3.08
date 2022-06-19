package com.demo.repositories;

import com.demo.models.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speakers,Long> {

}
