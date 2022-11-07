
public class Exec {
    public static final int QT_VEICULOS = 10;
    public static void main(String[] args) {
        Veiculo v;
        Veiculo vs[] = {new Carro(), new Bicicleta(), new Navio()};
        int iters = QT_VEICULOS;
        while (iters-- > 0) {
            v = vs[(int)(Math.random() * vs.length)];
            System.out.printf("Veiculo %d: %s\n", QT_VEICULOS - iters, v);
            v.acelerar();
            v.buzinar();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
