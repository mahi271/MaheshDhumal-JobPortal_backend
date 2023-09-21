package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Application;
import com.model.Job;
import com.model.JobSeeker;
import com.server.JobServiceInt;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("job")
public class TestJobController {
	@Autowired
	JobServiceInt jobService;
	
	//job seeker
	@PostMapping("/saveJobseeker")
	public JobSeeker savejobseeker(@RequestBody JobSeeker jobseeker)
	{
		return jobService.addJobSeeker(jobseeker);
		
	}
	@GetMapping("/getJobseeker/{id}")
	public JobSeeker findJobSeeker(@PathVariable int id)
	{
		return jobService.getOneJobSeeker(id);
		
	}
	@GetMapping("/getJobseekerusername/{username}")
	public JobSeeker findJobSeekerusername(@PathVariable String tempUsername)
	{
		return jobService.getOneJobSeekerusername(tempUsername);
	}
	
	
	
	
	
	//Job
	@PostMapping("/saveJob")
	public Job addJob(@RequestBody Job job)
	{
		return jobService.addJob(job);
	}
	@GetMapping("/getJob/{id}")
	public Job findJob(@PathVariable int id)
	{
		return jobService.getOneJob(id);
	}
	@GetMapping("/getAllJob")
	public List<Job> getAllJob()
	{
		return jobService.getAllJobs();
	}
	
	//Application
	@PostMapping("/saveApplication")
	public Application addApplication(@RequestBody Application application)
	{
		return jobService.addApplication(application);
	}
	@GetMapping("/getApplication/{applicationid}")
	public Application findApplication(@PathVariable int applicationid)
	{
		return jobService.getOneApplication(applicationid);
	}
	
	//login
	
	@PostMapping("/createUser")
	public JobSeeker createUser(@RequestBody JobSeeker jobseeker) throws Exception
	{
		String tempUsername =jobseeker.getUsername();
		if(tempUsername !=null && !"".equals(tempUsername)) {
			JobSeeker userObj=jobService.getUserByUsername(tempUsername);
			if(userObj!=null) {
				throw new Exception("User with "+tempUsername+" is already exit");
			}
		}
		JobSeeker userObj1=null;
		userObj1=jobService.addJobSeeker(jobseeker);
		return userObj1;
	}
	@PostMapping("/loginUser")
	public JobSeeker loginUser(@RequestBody JobSeeker jobseeker) throws Exception {
		String tempUsername=jobseeker.getUsername();
		int tempPass=jobseeker.getPassword();
		JobSeeker userObj=null;
		if(tempUsername !=null) {
			userObj=jobService.findByUsernameAndPassword(tempUsername, tempPass);
		}
		if(userObj==null) {
			throw new Exception("Bad Creadentials");
		}
		return userObj;
	}
	

}
