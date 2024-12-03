package com.balaji.sprig_boot_swagger.repository;

import com.balaji.sprig_boot_swagger.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {
    Optional<Job> findByLocation(String location);
}
