package Dnd;

public class Main {

    public static void main(String[] args) {

        CharacterDirector director = new CharacterDirector();

        Character warrior = director.createWarrior();
        Character mage = director.createMage();

        System.out.println("WARRIOR");
        warrior.showCharacter();

        System.out.println();

        System.out.println("MAGE");
        mage.showCharacter();
    }
}