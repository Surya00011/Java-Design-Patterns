package behavioralDesignPatterns.observerPattern;
/**
 * Subject interface
 */
public interface LinkedIn {
    void subscribeToJobAlerts(JobSeeker user);
    void unsubscribeAlerts(JobSeeker user);
    void notifyAllJobSeekers();
}
