package com.alm.highfi.conferencedemo.repositories;

import com.alm.highfi.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
