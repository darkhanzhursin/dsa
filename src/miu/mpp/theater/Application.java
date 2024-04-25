package miu.mpp.theater;

public class Application {

    public static void main(String[] args) {
        Theater theater = new Theater(10, 5);
        theater.showAllEmptySeats();
        theater.showAllReservedSeats();

        Person person = new Person("John");
        person.setTheater(theater);
        person.reserve();
        person.unreserve();
    }
}
