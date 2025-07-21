package behavioralDesignPatterns.observerPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedInJobAlert linkedAlert = new LinkedInJobAlert();
        LinkedInUser user1 = new LinkedInUser("Surya");
        LinkedInUser user2 = new LinkedInUser("Josh");
        LinkedInUser user3 = new LinkedInUser("Ashok");
        linkedAlert.subscribeToJobAlerts(user1);
        linkedAlert.subscribeToJobAlerts(user2);
        linkedAlert.subscribeToJobAlerts(user3);
        for (int i=0;i<jobOpenings().size();i++){
            if(i==10){
                linkedAlert.unsubscribeAlerts(user2);
            }
            Thread.sleep(2000);
            linkedAlert.postJobOpenings(jobOpenings().get(i));
        }
    }

    static List<String> jobOpenings() {
        return List.of(
                "Java Backend Developer",
                "Frontend React Developer",
                "Full Stack Engineer",
                "DevOps Engineer",
                "Cloud Architect - AWS",
                "Data Analyst",
                "Data Scientist",
                "Android App Developer",
                "iOS App Developer",
                "Software Engineer - Intern",
                "Spring Boot Developer",
                "Node.js Developer",
                "Python Developer",
                "Machine Learning Engineer",
                "QA Automation Tester",
                "UI/UX Designer",
                "Technical Support Engineer",
                "Cybersecurity Analyst",
                "Database Administrator (DBA)",
                "Product Manager",
                "Business Analyst",
                "Software Architect",
                "AI Research Engineer",
                "Blockchain Developer",
                "Game Developer - Unity",
                "Embedded Systems Engineer",
                "Network Engineer",
                "SDET (Software Dev Engineer in Test)",
                "Site Reliability Engineer (SRE)",
                "System Administrator"
        );
    }
}
