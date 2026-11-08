public class MainApp {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber user1 = new ConcreteSubscriber("Ivan");
        Subscriber user2 = new ConcreteSubscriber("Edmund");
        Subscriber user3 = new ConcreteSubscriber("Sebastian");
      
        agency.subscribe(user1);
        agency.subscribe(user2);
        agency.subscribe(user3);

        agency.publishNews("Classes and government work are suspended tomorrow.");
      
        System.out.println();
        agency.unsubscribe(user2);

        agency.publishNews("New technology has been released");

        System.out.println();
        Subscriber user4 = new ConcreteSubscriber("John");
        agency.subscribe(user4);

        agency.publishNews("There is an upcoming storm in the upcoming days");
    }
}
