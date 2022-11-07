public class ConsoleObserver implements Observer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    private static final String VALID = "CPF Valido!\n";
    private static final String INVALID = "CPF Invalido!\n";

    @Override
    public void actualize(String cpf, Boolean isValid) {
        if (isValid) {
            System.out.printf("%s%s%s", ANSI_GREEN, VALID, ANSI_RESET);
        } else {
            System.out.printf("%s%s%s", ANSI_RED, INVALID, ANSI_RESET);
        }
    }
}
