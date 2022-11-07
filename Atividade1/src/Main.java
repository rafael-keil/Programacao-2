public class Main {
    public static void main(String[] args) {
        CpfReaderSubject subject = new CpfReaderSubject();
        ConsoleObserver consoleObserver = new ConsoleObserver();
        FileObserver fileObserver = new FileObserver();

        subject.registerObserver(consoleObserver);
        subject.registerObserver(fileObserver);

        subject.readCpf();
    }
}