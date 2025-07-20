package structuralDesignPattern.decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Chatgpt freePlan = new ChatgptFreemium();
        System.out.println(freePlan.getDescription() + " | Cost: $" + freePlan.getCost());

        Chatgpt premiumPlan = new ChatgptPremium(freePlan);
        System.out.println(premiumPlan.getDescription() + " | Cost: $" + premiumPlan.getCost());

        Chatgpt proPlan = new ChatgptPro(premiumPlan);
        System.out.println(proPlan.getDescription() + " | Cost: $" + proPlan.getCost());
    }
}
