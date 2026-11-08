public interface Subscriber {
    
    // Method called automatically by NewsAgency when breaking news arrives
    void update(String news);
}
