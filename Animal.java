
package vu.zoo;



public class Animal {
    //Feilds
     String name;
     int age;

     //Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //Methods
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
    
    //Overloaded
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Animal eats " + foodType);
    }

     public void animalProfile(){
         System.out.println("Name:" +  name);
         System.out.println("Age:"+  age);
}
}