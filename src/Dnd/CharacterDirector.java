package Dnd;
public class CharacterDirector{
    public Dnd.Character createWarrior() {
        CharacterBuilder builder = new WarriorBuilder();
        return builder
                .setNickname("Astra")
                .setcharacterClass("Warrior")
                .setrace("Dwarf")
                .sethealth(2000)
                .setlevel(1)
                .setfaith(true)
                .setweapon("Heavy Axe")
                .build();
    }
    public Character createMage() {
        CharacterBuilder builder = new MageBuilder();
        return builder
                .setNickname("Luke")
                .setcharacterClass("Mage")
                .setrace("Human")
                .sethealth(1300)
                .setlevel(4)
                .setfaith(false)
                .setweapon("magic wand")
                .build();
    }
}