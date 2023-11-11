package ar.edu.unlp.info.oo1.ejercicio10;
import java.util.*;

public class JobHighestPriority implements JobStrategy {
	@Override
	public JobDescription next(JobScheduler jobSche) {		
		List<JobDescription> jobs = jobSche.getJobs();
		JobDescription nextJob = jobs.stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
		jobSche.unschedule(nextJob);
		return nextJob;
	}
}
