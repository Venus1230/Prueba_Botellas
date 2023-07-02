
    public class botella{
        private int capacidad;
        private String color;
        private float peso;

        private int stock;
        public botella(int capacidad, String color, float peso , int stock) {
            this.capacidad = capacidad;
            this.color = color;
            this.peso = peso;
            this.stock=stock;
        }

        public botella() {
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) {
            this.peso = peso;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public void datosb(int totalBotellas){
            System.out.println("-----------------------------------");
            System.out.println("Embotelladora");
            System.out.println("Botellas de Capacidad de 500ml");
            System.out.println("Color:" + color);
            System.out.println("Stock: "+totalBotellas);
            System.out.println("-----------------------------------");
        }
        public void datos2(int totalBotellas){
            System.out.println("-----------------------------------");
            System.out.println("Embotelladora");
            System.out.println("Botellas de Capacidad de 1000ml");
            System.out.println("Color:" + color);
            System.out.println("Stock: "+totalBotellas);
            System.out.println("-----------------------------------");
        }

    }


