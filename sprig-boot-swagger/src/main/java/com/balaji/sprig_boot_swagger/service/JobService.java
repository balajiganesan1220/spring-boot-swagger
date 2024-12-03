package com.balaji.sprig_boot_swagger.service;

import com.balaji.sprig_boot_swagger.entity.Job;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface JobService{
    List<Job> findAll();

    Job jobById(Long id);

    void createJob(Job job);

    Job updateJob(Job job);

    void deleteJob(Long id);
}
