package com.collebra.services.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.collebra.services.app.models.DependentEnrollee;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepository  extends JpaRepository<DependentEnrollee, Long>{

}