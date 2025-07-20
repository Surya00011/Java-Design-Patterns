package structuralDesignPattern.decoratorPattern;

public abstract class ChatgptDecorator implements Chatgpt {
    protected Chatgpt chatgpt;

    public ChatgptDecorator(Chatgpt chatgpt) {
        this.chatgpt = chatgpt;
    }

    @Override
    public String getDescription() {
        return chatgpt.getDescription();
    }

    @Override
    public double getCost() {
        return chatgpt.getCost();
    }
}
