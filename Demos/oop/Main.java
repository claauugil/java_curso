public class Main {

    public static void main(String[] args) {
        Character character1;
        Character character2;

        character1 = new Character("Katniss", 'H');
        character2 = new Character("Peeta", 'B');

        character2.isZombie = true;
        System.out.println( "Character name: " + character1.name);
        System.out.println( "This character is a " + character1.type);
        System.out.println("Is the character in zombie mode? " + character1.isZombie);
        System.out.println("Character name: " + character2.name);
        System.out.println( "This character is a " + character2.type);
        System.out.println("Is the character in zombie mode? " + character2.isZombie);
    }    
}


