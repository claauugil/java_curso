public class Character {
    String    name;
    int       lifePoints = 100;
    char      type;
    boolean   isZombie = false;

    Character(String givenName, char type)
    {
        this.name = givenName;
        this.type = type;
    }
}
