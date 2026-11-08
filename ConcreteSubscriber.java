package news.subscription;

public class ConcreteSubscriber implements Subscriber {
    private final String subscriberName;

    public ConcreteSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news) {
        System.out.println("[" + subscriberName + "] Received Breaking News Alert: " + news);
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}
