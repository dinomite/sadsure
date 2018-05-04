package com.quanticmind.sadsure;

import org.slf4j.Logger;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JobMonitor {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(JobMonitor.class);

    JobMonitor(JobHandler<Identifiable> jobHandler) {
        Executors.newSingleThreadScheduledExecutor()
                .scheduleAtFixedRate(getRunnable(jobHandler), 5, 5, TimeUnit.SECONDS);
    }

    static Runnable getRunnable(JobHandler<Identifiable> jobHandler) {
        return () -> jobHandler.getJobs().forEach(job -> {
            // This is why we want jobs to be Identifiable
            logger.info("Working on {}", job.getIdentity());

            // But we want them to maintain their real type, too
            // (they won't always be Widgets or have a shared supertype)
            jobHandler.doSomethingTo(job);
        });
    }
}
