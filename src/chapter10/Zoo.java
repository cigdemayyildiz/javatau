package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch(); // fetch is fun!
        rocky.makeSound(); // woof
        feed(rocky); // Here's your dog food

        Animal sasha = new Dog();
        sasha.makeSound(); // woof
        ((Dog) sasha).fetch(); // fetch is fun!
        feed(sasha); // Here's your dog food

        sasha = new Cat(); // type Animal, instance Dog
        sasha.makeSound(); // meow
        ((Cat) sasha).scratch(); // I am a cat, I can scratch
        feed(sasha); // Here's your cat food
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here's your dog food");
        }else if (animal instanceof Cat){
            System.out.println("Here's your cat food");
        }
    }
}
