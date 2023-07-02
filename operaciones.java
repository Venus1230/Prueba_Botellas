public class operaciones {
    private int ingreso;
    private int egreso;
    private int stock;

    public operaciones(int ingreso, int egreso, int stock) {
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.stock = stock;
    }

    public operaciones() {

    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getEgreso() {
        return egreso;
    }

    public void setEgreso(int egreso) {
        this.egreso = egreso;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int opera() {
        return (stock+ingreso )- egreso;
    }
}