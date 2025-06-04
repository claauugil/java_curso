public class Animal {
    public static void main(String[] args) {
        String name = "Panda";
        double weight = 160.15;
        long  population = 12000;
        byte maxAge =  30;
        System.out.println("""
                El animal del ejercicio es un: %s
                Los %ss pesan aproximadamente %.2f kk
                La población de ellos es de alrededor de %d en total
                Por lo general viven un máximo de %d años
                """.formatted(name, name, weight, population, maxAge));
    }
}
