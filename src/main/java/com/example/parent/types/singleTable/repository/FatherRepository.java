package com.example.parent.types.singleTable.repository;

import com.example.parent.types.singleTable.entity.Father;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherRepository extends JpaRepository<Father, Long> {
}
