package structuralDesignPattern.decoratorPattern;

public class ChatgptFreemium implements Chatgpt{

    @Override
    public String getDescription() {
        return "Basic freemium plan";
    }

    @Override
    public double getCost() {
        return 0.0;
    }

}
