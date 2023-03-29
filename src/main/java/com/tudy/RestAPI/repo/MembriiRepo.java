package com.tudy.RestAPI.repo;

import com.tudy.RestAPI.controllers.models.Membrii;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembriiRepo extends JpaRepository<Membrii,Long> {
}
