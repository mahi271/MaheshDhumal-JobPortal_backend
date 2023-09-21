package com.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ApplicationRepository;
import com.dao.JobRepository;
import com.dao.JobSeekerRepository;
import com.model.Application;
import com.model.Job;
import com.model.JobSeeker;

@Service
public class JobServiceImp implements JobServiceInt{
	@Autowired
	JobSeekerRepository jobseekerRepo;
	
	
	
	@Autowired
	JobRepository jobRepo;
	
	
	
	@Autowired
	ApplicationRepository applicationRepo;
	
	

	@Override
	public JobSeeker addJobSeeker(JobSeeker jobseeker) {
		// TODO Auto-generated method stub
		return jobseekerRepo.save(jobseeker);
	}

	@Override
	public JobSeeker getOneJobSeeker(int id) {
		// TODO Auto-generated method stub
		return jobseekerRepo.findById(id).orElse(null);
	}
	@Override
	public JobSeeker getOneJobSeekerusername(String tempUsername) {
		// TODO Auto-generated method stub
		return jobseekerRepo.findByUsername(tempUsername);
	}

	

	@Override
	public Job addJob(Job job) {
		// TODO Auto-generated method stub
		return jobRepo.save(job);
	}

	@Override
	public Job getOneJob(int id) {
		// TODO Auto-generated method stub
		return jobRepo.findById(id).orElse(null);
	}
	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return jobRepo.findAll();
	}
	

	@Override
	public Application addApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationRepo.save(application);
	}

	@Override
	public Application getOneApplication(int applicationid) {
		// TODO Auto-generated method stub
		return applicationRepo.findById(applicationid).orElse(null);
	}

	

	@Override
	public List<Application> getAllApplications() {
		// TODO Auto-generated method stub
		return applicationRepo.findAll();
	}

	@Override
	public JobSeeker findByUsernameAndPassword(String username, int password) {
		
		return jobseekerRepo.findByUsernameAndPassword(username,password);
	}

	@Override
	public JobSeeker getUserByUsername(String tempUsername) {
		// TODO Auto-generated method stub
		return jobseekerRepo.findByUsername( tempUsername);
	}

	

	

}
