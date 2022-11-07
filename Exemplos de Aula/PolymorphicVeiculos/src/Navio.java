
public class Navio implements Veiculo {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    @Override
    public void acelerar() {
        System.out.printf("%s%s%s", ANSI_BLUE, "SWISHSWISH\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_BLUE, "SWISHSWISH SWISHSWISH\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_BLUE, "SWISHSWISH SWISHSWISH SWISHSWISH SWISHSWISH\n", ANSI_RESET);
    }

    @Override
    public void buzinar() {
        System.out.printf("%s%s%s", ANSI_CYAN, "PU...UMMMMM\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_CYAN, "PU...UMMMMM PU...UMMMMM\n", ANSI_RESET);
        System.out.printf("%s%s%s", ANSI_CYAN, "PU...UMMMMM PU...UMMMMM PU...UMMMMM PU...UMMMMM\n", ANSI_RESET);
    }

    @Override
    public String toString() {
        return "Sou um navio!";
    }
}
