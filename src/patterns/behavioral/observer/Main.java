package patterns.behavioral.observer;

import static patterns.behavioral.observer.Event.NEW_ITEM;
import static patterns.behavioral.observer.Event.SALE;

public class Main {
    /*
    - allows you to change or take action on a set of objects when and if the state of another object changes
    - this can be done even of the modifiable set of objects is unknown beforehand or changes dynamically
    - you can introduce new subscriber classes without having to change the publisher's code, and vice versa if
    there's a publisher interface
    * */
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("test@mail.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("test@mail.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("test"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("test@mail.com"));
        store.salePromotion();
    }
}
