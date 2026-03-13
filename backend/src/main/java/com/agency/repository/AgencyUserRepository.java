package com.agency.repository;

import com.agency.repository.entity.AgencyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyUserRepository extends JpaRepository<AgencyUser, Long> {
}
