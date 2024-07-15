package com.example.parent.repository;

import com.example.parent.classes.FirstSon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstSonRepository extends JpaRepository<FirstSon, Long> {
}
