package Animal;

public class Parrot extends Bird{
    public boolean canTalk;

    Parrot(String name, int size, boolean isCarnivorous, int numberOfLegs, boolean canTalk) {
        super(name, size, isCarnivorous, numberOfLegs);
        this.canTalk = canTalk;

    }

    @Override
    public String introduce() {
        String talkStr = canTalk ? "je peux parler" : "je ne peux pas parler";
        return super.introduce() + " et " + talkStr + ".";
    }

    @Override
    public void fly() {
        System.out.println("Je peux voler.");
    }
}

