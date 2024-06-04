package vu.zoo;


public class Zoo {
    public static void main(String[] args) {
        // Create instances of animals
        Animal lion = new Lion("Jujju", 11);
        Animal elephant = new Elephant("Vivan", 2);
        Animal monkey = new Monkey("Lari", 6);

        //  Demonstrate Polymorphism through method overloading
        System.out.println();
        System.out.println("Lion");
        lion.animalProfile();
        lion.makeSound();
        lion.makeSound(3);
        lion.eat();
        lion.eat("meat\n");
        
        System.out.println();
        System.out.println("Elephant");
        elephant.animalProfile();
        elephant.makeSound();
        elephant.makeSound(2);
        elephant.eat();
        elephant.eat("grass\n");
        
        System.out.println();
        System.out.println("Monkey");
        monkey.animalProfile();
        monkey.makeSound();
        monkey.makeSound(4);
        monkey.eat();
        monkey.eat("bananas\n");
    }
}

