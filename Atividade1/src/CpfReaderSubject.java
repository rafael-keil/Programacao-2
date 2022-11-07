import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CpfReaderSubject implements Subject {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static final String EXIT = "sair";
    private static final String INPUT_TEXT = "Digite um CPF: ";
    private static final String ERROR_MESSAGE = "Input Invalido!\n";
    volatile String cpf = "";
    Boolean isValid = false;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.actualize(cpf, isValid);
        }
    }

    public void readCpf() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print(INPUT_TEXT);
            try {
                cpf = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (cpf.equalsIgnoreCase(EXIT)) break;

            try {
                String numberOnly = cpf.replaceAll("\\D", "");
                Integer[] valid = Arrays.stream(numberOnly.split(""))
                        .map(Integer::valueOf)
                        .toArray(Integer[]::new);

                isValid = new Cpf(valid).validate();

                notifyObservers();
            } catch (Exception e) {
                System.out.printf("%s%s%s", ANSI_RED, ERROR_MESSAGE, ANSI_RESET);
            }

        }
    }


}
