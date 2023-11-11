package ar.edu.unlp.info.oo1.ejercicio10;
import java.util.*;

public class JobMostEffort implements JobStrategy{

	@Override
	public JobDescription next(JobScheduler jobSche) {		
		List<JobDescription> jobs = jobSche.getJobs();
		JobDescription nextJob = jobs.stream().max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort())).orElse(null);
		jobSche.unschedule(nextJob);
		return nextJob;	
	}
}
