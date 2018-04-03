package com.econtabil.integration.repository;

import java.util.List;

import com.econtabil.integration.data.BaseJPARepository;
import com.econtabil.integration.domain.Job;

/**
 * @author: kameshr
 */
public interface JobRepository extends BaseJPARepository<Job, Long> {
    /**
     *
     * @param count
     * @return
     */
    public List<Job> fetchNewJobsToBeScheduledForExecutionPerPriority(int count);

    /**
     *
     * @param count
     * @return
     */
    public List<Job> fetchFailedJobsToBeScheduledForExecutionPerPriority(int count);

    /**
     *
     * @param count
     * @return
     */
    public List<Job> fetchNewJobsToBeScheduledForExecutionPerSubmissionTimePriority(int count);

    /**
     *
     * @param count
     * @return
     */
    public List<Job> fetchFailedJobsToBeScheduledForExecutionPerSubmissionTimePriority(int count);
}
