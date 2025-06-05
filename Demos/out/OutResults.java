public class OutResults {
    public static void main(String[] args) {
        String name = "Paula";
        String surname = "Zacarias";
        byte   age = 25;
        String joinedString;
        joinedString = "Hola " + name + " " + surname + " ¿Como estas a tus " + age + " años?";
        /*System.out.println("Hola " + name + " " + surname + " como estas a tus " + age + " años");
        System.out.printf("Hola %s %s como estas a tus %d años\n", name, surname, age);
        System.out.println("""
                Hola %s %s
                ¿como estás a tus %d años?
                """.formatted(name, surname, age));*/
        System.out.println(joinedString);
    }
}
