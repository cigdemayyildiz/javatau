package chapter11;

// Interface
public interface Product {

    /*
     * Now notice, even though we have the getter and setter methods here,
     * we do not have the fields defined themselves.
     * That's because if you define a field within an interface,
     * then that field has to be final. Because it's final,
     * it's essentially a constant, and therefore you have to also give it a value.
     */


    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return "no barcode";
    }

}
