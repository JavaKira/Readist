package com.github.javakira.readist.repository;

import com.github.javakira.readist.entity.ReadSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadSessionRepository extends JpaRepository<ReadSession, Long> {
}
