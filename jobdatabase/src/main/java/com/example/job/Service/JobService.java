package com.example.job.Service;

import com.example.job.Entity.Job;
import com.example.job.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    // spara jobb med hjälp av inbyggd metod somm kommer från JpaRepository
    public void saveJob(Job job){
        jobRepository.save(job);
    }

    // Visa alla jobb med hjälp av inbyggd metod
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

}
