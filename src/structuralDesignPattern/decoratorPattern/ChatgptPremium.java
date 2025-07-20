package structuralDesignPattern.decoratorPattern;

public class ChatgptPremium extends ChatgptDecorator {

    public ChatgptPremium(Chatgpt chatgpt) {
        super(chatgpt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Limited Voice Chat (Premium)";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20.0;
    }
}
