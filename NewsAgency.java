import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NewsAgency {
    private final List<Subscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        this.subscribers = new CopyOnWriteArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        if (subscriber != null && !subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("System: Subscriber added");
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("System: A subscriber has unsubscribed");
        }
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\nBREAKING NEWS PUBLISHED: \"" + news + "\"");
        notifySubscribers();
    }
}
