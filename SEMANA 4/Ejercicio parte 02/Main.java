class Main {

    public static void main(String[] args) {
        // Crear un coche
        Coche coche1 = new Coche("Toyota", "Corolla", 58, 180, 4);
        coche1.describir();
        coche1.acelerar();
        coche1.llenarTanque();

        // Crear una motocicleta
        Motocicleta moto1 = new Motocicleta("Honda", "CBR600", 18, 220, false);
        moto1.describir();
        moto1.acelerar();
        moto1.llenarTanque();
    }
}