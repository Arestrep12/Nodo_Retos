public class CuentaCorriente {
    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(CuentaCorriente c) {
        this.saldo = c.saldo;
    }

    public void ingreso(double cantidad) {
        saldo += cantidad;
    }

    public void egreso(double cantidad) {
        saldo -= cantidad;
    }

    public void reintegro(double cantidad) {
        saldo += cantidad;
    }

    public void transferencia(CuentaCorriente c, double cantidad) {
        saldo -= cantidad;
        c.saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
