package behavioralDesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject
 */
public class LinkedInJobAlert implements LinkedIn{
    private String jobTitle;
    private List<JobSeeker> jobSeekerList = new ArrayList<>();

    /**
     * subscribeToJobAlerts methods add observers
     * @param user
     */
    @Override
    public void subscribeToJobAlerts(JobSeeker user) {
        jobSeekerList.add(user);
    }
    /**
     * unsubscribeAlerts methods remove observers
     * @param user
     */
    @Override
    public void unsubscribeAlerts(JobSeeker user) {
         jobSeekerList.remove(user);
    }

    /**
     * notifyAllJobSeekers
     * notifies to jobseekers when state of object is changed
     */
    @Override
    public void notifyAllJobSeekers() {
        for(JobSeeker subscriber: jobSeekerList){
            subscriber.update(jobTitle);
        }
    }

    /**
     * postJobOpenings method changes state of object and calls notifyAllJobSeekers
     * @param jobTitle
     */
    public void postJobOpenings(String jobTitle){
        this.jobTitle=jobTitle;
        notifyAllJobSeekers();
    }
}
