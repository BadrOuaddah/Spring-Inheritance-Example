package com.example.parent.types.joined.repository;

import com.example.parent.types.joined.entity.SonJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SonJRepository extends JpaRepository<SonJ, Long> {
}
