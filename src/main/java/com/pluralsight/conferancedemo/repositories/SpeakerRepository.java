package com.pluralsight.conferancedemo.repositories;

import com.pluralsight.conferancedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
