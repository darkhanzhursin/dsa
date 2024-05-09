package patterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();
        buyCryptoFacade.buyCryptocurrency(1000, "BTC");
        buyCryptoFacade.buyCryptocurrency(500, "ETH");
    }
}
