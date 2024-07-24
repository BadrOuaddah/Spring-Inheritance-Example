package com.example.parent.types.singleTable.repository;

import com.example.parent.types.singleTable.entity.FirstSon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstSonRepository extends JpaRepository<FirstSon, Long> {
}
