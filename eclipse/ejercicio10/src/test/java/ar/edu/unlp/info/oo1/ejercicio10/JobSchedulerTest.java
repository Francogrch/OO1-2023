package ar.edu.unlp.info.oo1.ejercicio10;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;
    protected JobLIFO jobLIFO;
    protected JobFIFO jobFIFO;
    protected JobHighestPriority jobHP;
    protected JobMostEffort jobME;

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }
    private void initializeStrategy() {
    	jobLIFO = new JobLIFO();
    	jobFIFO = new JobFIFO();
    	jobHP = new JobHighestPriority();
    	jobME = new JobMostEffort();
    }
    @BeforeEach
    void setUp() {
        this.initializeJobs();
        this.initializeStrategy();
    }

    private JobScheduler newFifoScheduler() {
        JobScheduler fifoScheduler = new JobScheduler(jobFIFO);
        return fifoScheduler;
    }

    private JobScheduler newLifoScheduler() {
        JobScheduler lifoScheduler = new JobScheduler(jobLIFO);
        return lifoScheduler;
    }

    private JobScheduler newPriorityScheduler() {
        JobScheduler priorityScheduler = new JobScheduler(jobHP);
        return priorityScheduler;
    }

    private JobScheduler newEffortScheduler() {
        JobScheduler effortScheduler = new JobScheduler(jobME);
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new JobScheduler();
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new JobScheduler();
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
