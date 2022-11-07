
public class Carro implements Veiculo {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    @Override
    public void acelerar() {
        System.out.printf("%s%s%s", ANSI_RED, "ROOOOMMMM\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_RED, "ROOOOMMMM ROOOOMMMM\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_RED, "ROOOOMMMM ROOOOMMMM ROOOOMMMM ROOOOMMMM\n", ANSI_RESET);
    }

    @Override
    public void buzinar() {
        System.out.printf("%s%s%s", ANSI_YELLOW, "BIIIBIII\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_YELLOW, "BIIIBIII BIIIBIII\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_YELLOW, "BIIIBIII BIIIBIII BIIIBIII BIIIBIII\n", ANSI_RESET);
    }

    @Override
    public String toString() {
        return "Sou um carro!";
    }
}
