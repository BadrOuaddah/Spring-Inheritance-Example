package com.example.parent.types.single_table.repository;

import com.example.parent.types.single_table.entity.Father;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherRepository extends JpaRepository<Father, Long> {
}
