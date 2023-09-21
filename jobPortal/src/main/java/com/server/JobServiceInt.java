package com.server;

import java.util.List;

import com.model.Application;
import com.model.Job;
import com.model.JobSeeker;


public interface JobServiceInt {
	JobSeeker addJobSeeker(JobSeeker jobseeker);
	JobSeeker getOneJobSeeker(int id);
	JobSeeker getOneJobSeekerusername(String tempUsername);

	
	
	
	
	Job addJob(Job job);
	Job getOneJob(int id);
	List<Job> getAllJobs();
	
	Application addApplication(Application application);
	Application getOneApplication(int applicationid);
	List<Application> getAllApplications();
	
	public JobSeeker findByUsernameAndPassword(String username ,int password);
	JobSeeker getUserByUsername(String tempUsername);
	
	

}
