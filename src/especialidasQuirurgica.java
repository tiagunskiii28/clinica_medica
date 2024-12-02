public enum especialidasQuirurgica {
    cirugiaGeneral("Cirugia General", 1, 1, cirujanos["Juan"]);


    private String nombre;
    private int edificio;
    private int planta;
    private String[] cirujanos;
    especialidasQuirurgica(String nombre, int edificio, int planta, String[] cirujanos){
        this.nombre = nombre;//t
        this.edificio = edificio;
        this.planta = planta;
        this.cirujanos = cirujanos;
    }
}

