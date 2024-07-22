package com.example.parent.types.joined.repository;

import com.example.parent.types.joined.entity.FatherJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherJRepository extends JpaRepository<FatherJ, Long> {
}
