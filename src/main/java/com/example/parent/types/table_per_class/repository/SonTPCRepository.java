package com.example.parent.types.table_per_class.repository;

import com.example.parent.types.table_per_class.entity.SonTPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SonTPCRepository extends JpaRepository<SonTPC, Long> {
}
