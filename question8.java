package Assignment_2;

class Animal {
    static void display() {
        System.out.println("Animal display");
    }
}

class Dog extends Animal {
    static void display() {
        System.out.println("Dog display");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dogAsAnimal = new Dog();
        Dog dog = new Dog();

        animal.display();       
        dogAsAnimal.display();  
        dog.display();          
    }
}
