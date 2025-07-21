package behavioralDesignPatterns.observerPattern;

/**
 * Concrete Observer
 */
public class LinkedInUser implements JobSeeker{
    private String name;
    public LinkedInUser(String name){
        this.name=name;
    }

    /**
     * update method receives notification
     * @param jobTitle
     */
    @Override
    public void update(String jobTitle) {
        System.out.println("Hey..! " +name+" openings for "+ jobTitle+" posted on LinkedIn");
    }
}
