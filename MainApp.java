package news.subscription;

public class MainApp {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber user1 = new ConcreteSubscriber("Alice");
        Subscriber user2 = new ConcreteSubscriber("Bob");
        Subscriber user3 = new ConcreteSubscriber("Charlie");
      
        agency.subscribe(user1);
        agency.subscribe(user2);
        agency.subscribe(user3);

        agency.publishNews("Typhoon warning raised in Metro Manila!");
      
        System.out.println();
        agency.unsubscribe(user2);

        agency.publishNews("Classes and government work suspended tomorrow.");

        System.out.println();
        Subscriber user4 = new ConcreteSubscriber("Diana");
        agency.subscribe(user4);

        agency.publishNews("Public transportation operating on regular schedule.");
    }
}
