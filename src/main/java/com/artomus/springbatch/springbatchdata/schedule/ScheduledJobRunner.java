package com.artomus.springbatch.springbatchdata.schedule;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledJobRunner {

    private final JobLauncher jobLauncher;
    private final Job importUserJob;

    public ScheduledJobRunner(JobLauncher jobLauncher, Job importUserJob) {
        this.jobLauncher = jobLauncher;
        this.importUserJob = importUserJob;
    }

    @Scheduled(cron = "0 0 * * * ?")  // This cron expression runs the job every hour
    public void runScheduledJob() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("time", System.currentTimeMillis())
                .toJobParameters();

        jobLauncher.run(importUserJob, jobParameters);
    }
}
