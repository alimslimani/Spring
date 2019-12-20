package com.alm.highfi.conferencedemo.repositories;

import com.alm.highfi.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
