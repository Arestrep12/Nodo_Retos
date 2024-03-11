public class Contador {
    private int num;

    public Contador(int num) {
        this.num = num;
    }
    public Contador() {
    }

    public Contador(Contador c) {
        this.num = c.num;
    }

    public void incrementar() {
        num++;
    }

    public void decrementar() {
        num--;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
