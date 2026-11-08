package news.subscription;

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
            System.out.println("System: A new subscriber has joined the service.");
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("System: A subscriber has unsubscribed from the service.");
        }
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\n=== BREAKING NEWS PUBLISHED: \"" + news + "\" ===");
        notifySubscribers();
    }
}
