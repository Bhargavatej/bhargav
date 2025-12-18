class test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}