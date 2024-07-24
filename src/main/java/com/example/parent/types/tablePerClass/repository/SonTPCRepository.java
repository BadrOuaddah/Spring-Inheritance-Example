package com.example.parent.types.tablePerClass.repository;

import com.example.parent.types.tablePerClass.entity.SonTPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SonTPCRepository extends JpaRepository<SonTPC, Long> {
}
