package Dnd;

public interface CharacterBuilder {
    CharacterBuilder setNickname(String nickname);
    CharacterBuilder setrace(String race);
    CharacterBuilder setcharacterClass(String characterClass);
    CharacterBuilder sethealth(int health);
    CharacterBuilder setlevel(int level);
    CharacterBuilder setfaith(boolean faith);
    CharacterBuilder setweapon(String weapon);
    Character build();
}
