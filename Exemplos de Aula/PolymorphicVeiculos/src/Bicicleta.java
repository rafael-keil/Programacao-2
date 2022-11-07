
public class Bicicleta implements Veiculo {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    public void acelerar() {
        System.out.printf("%s%s%s", ANSI_GREEN, "PEDALA\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_GREEN, "PEDALA PEDALA\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_GREEN, "PEDALA PEDALA PEDALA PEDALA\n", ANSI_RESET);
    }

    @Override
    public void buzinar() {
        System.out.printf("%s%s%s", ANSI_PURPLE, "TRIMMMM\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_PURPLE, "TRIMMMM TRIMMMM\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_PURPLE, "TRIMMMM TRIMMMM TRIMMMM TRIMMMM\n", ANSI_RESET);
    }

    @Override
    public String toString() {
        return "Sou uma bicicleta!";
    }
}
