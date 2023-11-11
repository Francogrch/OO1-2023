package ar.edu.unlp.info.oo1.ejercicio10;

public class JobFIFO implements JobStrategy{
	@Override
	public JobDescription next(JobScheduler jobSche) {		
        JobDescription nextJob = jobSche.getJobs().get(0);
        jobSche.unschedule(nextJob);
        return nextJob;
	}
}
