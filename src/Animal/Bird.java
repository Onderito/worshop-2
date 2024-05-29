package Animal;

public abstract class Bird extends Animal{

    Bird(String name, int size, boolean isCarnivorous, int numberOfLegs) {
        super(name, size, isCarnivorous, numberOfLegs);
    }

    abstract void fly(); // implémentation d'une methode abstract
}
