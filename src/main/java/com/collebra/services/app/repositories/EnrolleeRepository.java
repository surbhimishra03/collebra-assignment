package com.collebra.services.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.collebra.services.app.models.Enrollee;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolleeRepository extends  JpaRepository<Enrollee, Long> {
	 
}

