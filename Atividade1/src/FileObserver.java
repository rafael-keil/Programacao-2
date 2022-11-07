import java.io.FileWriter;
import java.io.IOException;

public class FileObserver implements Observer {
    private static final String FILE_NAME = "cpfs.txt";
    private static final String VALID = "V\n";
    private static final String INVALID = "I\n";
    FileWriter file;

    @Override
    public void actualize(String cpf, Boolean isValid) {
        try {
            file = new FileWriter(FILE_NAME, true);

            file.write(cpf + " -> " + (isValid ? VALID : INVALID));

            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
