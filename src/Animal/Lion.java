package Animal;

public class Lion extends Animal implements Carnivorous {
   public boolean isAlpha;

    Lion(String name, int size, boolean isCarnivorous, int numberOfLegs, boolean isAlpha) {
        super(name, size, isCarnivorous, numberOfLegs);
        this.isAlpha = isAlpha;
    }

    @Override
    public String introduce() {
        String alphaStr = isAlpha ? "Je suis le chef de la meute" : "Je ne suis pas le chef de la meute";
        return super.introduce() + " " + alphaStr + ".";
    }

    @Override
    public void hunt() {
        System.out.println("Je chasse des proies.");
    }
}
