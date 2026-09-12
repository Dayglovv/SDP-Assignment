package Dnd;
public class Character {
    private String nickname;
    private String race;
    private String characterClass;
    private int health;
    private int level;
    private boolean faith;
    private String weapon;

    public Character (
            String nickname,
            String race,
            String characterClass,
            int health,
            int level,
            boolean faith,
            String weapon
    ){
        this.nickname=nickname;
        this.race=race;
        this.characterClass=characterClass;
        this.health=health;
        this.level=level;
        this.weapon=weapon;
    }
    public void showCharacter(){
        System.out.println("Nickname: " + nickname);
        System.out.println("race: " + race);
        System.out.println("characterClass: " + characterClass);
        System.out.println("health: " + health);
        System.out.println("level: " + level);
        System.out.println("faith: " + faith);
        System.out.println("weapon: " + weapon);    }
}
