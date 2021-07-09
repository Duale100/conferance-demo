package com.pluralsight.conferancedemo.repositories;

import com.pluralsight.conferancedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
