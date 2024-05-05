package patterns.behavioral.observer;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomer(Event.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomer(Event.SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }
}
