public class Person {
    public static void main(String[] args) {
        byte age = 22;
        short yearOfBirth = 2004;
        String name = "Ana";
        int countryPopulation = 40_000_000;
        double height = 1.68;
        String pet = "Dog";
        System.out.println("Her name is " + name + ", " + "she is " + age + ".");
        System.out.println("She is " + height + " meters tall" +  ".");
        System.out.println("She was born in " + yearOfBirth + ".");
        System.out.println("""
                In madrid which has a population of: %d people.
                And she has a pet, which is a: %s and its named is Bolt.
                """.formatted(countryPopulation, pet));
    }
}
