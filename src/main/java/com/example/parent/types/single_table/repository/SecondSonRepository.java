package com.example.parent.types.single_table.repository;

import com.example.parent.types.single_table.entity.SecondSon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondSonRepository extends JpaRepository<SecondSon, Long> {
}
