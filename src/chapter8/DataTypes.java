package chapter8;

public class DataTypes {

    public static void main(String[] args) {

        int number1 = 5; // Primitive Data Type
        Integer number2 = 5; // Wrapper Class

        double[] numbers = {1.5, 3.99, 45.5, 222.6};
        convertDecimalToInt(numbers);

        int[] nums = {3,8,22,678};
        convertIntToDecimal(nums);
    }

    public static void convertDecimalToInt(double [] numbers){

        for (Double number : numbers){
            System.out.println(number.intValue());
        }
    }

    public static void convertIntToDecimal(int [] numbers){

        for (Integer number : numbers){
            System.out.println(number.doubleValue());
        }
    }
}
