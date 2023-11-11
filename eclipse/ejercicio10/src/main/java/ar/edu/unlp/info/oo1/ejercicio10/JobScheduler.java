package ar.edu.unlp.info.oo1.ejercicio10;
import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected JobStrategy strategy;

    public JobScheduler () {
    	this.jobs = new ArrayList<>();
//    	this.strategy = null; // O tendria que poner alguno por default?
    	this.strategy = new JobFIFO();
    }
    public JobScheduler (JobStrategy strategy) {
        this.jobs = new ArrayList<>();
        this.strategy = strategy;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public JobStrategy getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(JobStrategy aStrategy) {
        this.strategy = aStrategy;
    }

    
    public JobDescription next() {
    	return strategy.next(this);
    }


}
