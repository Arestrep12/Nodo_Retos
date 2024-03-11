import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar calendario;

    // Constructor por defecto
    public Fecha() {
        this.calendario = new GregorianCalendar();
    }

    // Constructor con día, mes y año
    public Fecha(int dia, int mes, int anio) {
        this.calendario = new GregorianCalendar(anio, mes - 1, dia);
    }

    // Métodos de acceso
    public int getDia() {
        return calendario.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getMes() {
        return calendario.get(GregorianCalendar.MONTH) + 1;
    }

    public int getAnio() {
        return calendario.get(GregorianCalendar.YEAR);
    }

    // Método toString
    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAnio();
    }

    // Método para comprobar si la fecha es correcta
    public boolean esFechaCorrecta() {
        return calendario.isLenient();
    }

    // Método para sumar un día al valor actual de la fecha
    public void sumarUnDia() {
        calendario.add(GregorianCalendar.DAY_OF_MONTH, 1);
    }
}
