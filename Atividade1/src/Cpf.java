public class Cpf {
    public Integer[] cpf;
    public Boolean isValid = true;

    public Cpf(Integer[] cpf) {
        this.cpf = cpf;
    }

    public Boolean validate() {
        calculate(10);
        calculate(11);

        return isValid;
    }

    private void calculate(Integer digit) {
        Integer acum = 0;

        for (int i = digit; i > 1; i--) {
            acum += cpf[Math.abs(i - digit)] * i;
        }

        if (acum * 10 % 11 != cpf[digit-1]) isValid = false;
    }
}
