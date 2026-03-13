package com.agency.repository;

import com.agency.repository.entity.Viewing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewingRepository extends JpaRepository<Viewing, Long> {
}
