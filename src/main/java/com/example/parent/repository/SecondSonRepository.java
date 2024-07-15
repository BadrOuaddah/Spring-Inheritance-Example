package com.example.parent.repository;

import com.example.parent.classes.SecondSon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondSonRepository extends JpaRepository<SecondSon, Long> {
}
