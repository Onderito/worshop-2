package Animal;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("lion", 70, true, 4, true);
        System.out.println(lion.introduce());
        lion.hunt();


       Parrot parrot = new Parrot("parrot", 40, false, 2, false);
        System.out.println(parrot.introduce());
       parrot.fly();
    }


}
