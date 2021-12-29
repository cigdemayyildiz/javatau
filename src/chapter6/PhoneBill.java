package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill(){
        int id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes(){
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if (usedMinutes <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        double subtotal = (baseCost + calculateOverage());
        return subtotal * taxRate;
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("Bill Statement:");
        System.out.println("ID: " + id);
        System.out.println("Base Cost: $"+String.format("%.2f", baseCost));
        System.out.println("Overage: $"+String.format("%.2f",calculateOverage()));
        System.out.println("Tax: $"+String.format("%.2f",calculateTax()));
        System.out.println("Total: $"+String.format("%.2f",calculateTotal()));
    }
}
