package com.example.parent.types.tablePerClass.repository;

import com.example.parent.types.tablePerClass.entity.FatherTPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherTPCRepository extends JpaRepository<FatherTPC, Long> {
}
