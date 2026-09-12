package Dnd;

public class MageBuilder implements CharacterBuilder{
    private String Nickname;
    private String race;
    private String characterClass;
    private int health;
    private int level;
    private boolean faith;
    private String weapon;
    @Override
    public CharacterBuilder setNickname(String Nickname){
        this.Nickname = Nickname;
        return this;
    }
    @Override
    public CharacterBuilder setrace(String race){
        this.race = race;
        return this;
    }
    @Override
    public CharacterBuilder setcharacterClass(String characterClass){
        this.characterClass = characterClass;
        return this;
    }
    @Override
    public CharacterBuilder sethealth(int health){
        this.health = health;
        return this;
    }
    @Override
    public CharacterBuilder setlevel(int level){
        this.level = level;
        return this;
    }
    @Override
    public CharacterBuilder setfaith(boolean faith){
        this.faith = faith;
        return this;
    }
    @Override  public CharacterBuilder setweapon(String weapon) {
        this.weapon = weapon;
        return this;
    }
    @Override
    public Dnd.Character build() {
        if (Nickname == null || race == null || characterClass == null) {
            throw new IllegalStateException("Some character information is missing");
        }
        if (level < 1) {
            throw new IllegalStateException("Level must be at least 1");
        }
        if (health <= 0){
            throw new IllegalStateException("Health should be abive zero");
        }
        return new Character(
                Nickname,
                race,
                characterClass,
                health,
                level,
                faith,
                weapon
        );
    }
}
