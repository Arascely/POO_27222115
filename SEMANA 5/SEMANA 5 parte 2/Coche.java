class Coche implements Movible {
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    @Override
    public void moverse() {
        System.out.println("El coche de la marca " + marca + " se está moviendo por la carretera.");
    }
}