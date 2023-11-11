package ar.edu.unlp.info.oo1.ejercicio10;
import java.util.*;

public class JobLIFO implements JobStrategy{

	@Override
	public JobDescription next(JobScheduler jobSche) {		
		List<JobDescription> jobs = jobSche.getJobs();
		JobDescription nextJob = jobs.get(jobs.size()-1);
		jobSche.unschedule(nextJob);
        return nextJob;
	}
}
