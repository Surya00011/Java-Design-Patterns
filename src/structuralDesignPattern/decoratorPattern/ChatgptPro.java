package structuralDesignPattern.decoratorPattern;

public class ChatgptPro extends ChatgptDecorator {

    public ChatgptPro(Chatgpt chatgpt) {
        super(chatgpt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Unlimited Voice Chat (Pro)";
    }

    @Override
    public double getCost() {
        return super.getCost() + 40.0;
    }
}
