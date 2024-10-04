class Avion implements Movible {
    private String aerolinea;

    public Avion(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Override
    public void moverse () {
        System.out.println("El avión de la aerolínea " + aerolinea + " está volando en el cielo.");
    }
}

