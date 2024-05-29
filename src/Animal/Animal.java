package Animal;

class Animal {
    String name;
    int size;
    boolean isCarnivorous = false;
    int numberOfLegs;

    Animal(String name, int size, boolean isCarnivorous, int numberOfLegs) {
        this.name = name;
        this.size = size;
        this.isCarnivorous = isCarnivorous;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        isCarnivorous = carnivorous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String introduce() {
        String dangerStatus = isDangerous() ? "je suis carnivore et dangereux." : "je ne suis pas carnivore et je ne suis pas dangereux";
       return("Hey, en tant que " + name + " j'ai " + numberOfLegs + " pattes et " + dangerStatus);

    }

    boolean isDangerous() {
        return size > 50 && isCarnivorous;
    }
}
