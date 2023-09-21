package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Job;
import com.model.JobSeeker;

public interface JobRepository extends JpaRepository<Job,Integer>{


}
