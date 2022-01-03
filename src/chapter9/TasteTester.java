package chapter9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("almond");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95);
        birthdayCake.setCandles(8);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake candles: " + birthdayCake.getCandles());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(99.99);
        weddingCake.setFlavor("pina colada");
        weddingCake.setTiers(3);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake tiers: " + weddingCake.getTiers());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}
