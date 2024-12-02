import java.util.Date;

public class Paciente {
    // Atributos privados
    private String nombreCompleto;
    private String ID;
    private int edad;
    private String genero;
    private String diagnostico;
    private int prioridadMedica; // Nivel 1 mínimo, nivel 5 máximo
    private String estadoClinico;
    private String especialidadQuirurgica;
    private String cirujanoAsignado;
    private Date ingresoListaEspera;
    private int posicionCola;
    private String telefono;
    private String numeroCatSalut;
    private String notasAdicionales;

    // Constructor
    public Paciente(String nombreCompleto, String ID, int edad, String genero, String diagnostico, int prioridadMedica,
                    String estadoClinico, String especialidadQuirurgica, String cirujanoAsignado, Date ingresoListaEspera,
                    int posicionCola, String telefono, String numeroCatSalut, String notasAdicionales) {
        this.nombreCompleto = nombreCompleto;
        this.ID = ID;
        this.edad = edad;
        this.genero = genero;
        this.diagnostico = diagnostico;
        setPrioridadMedica(prioridadMedica); // Usamos el setter para validación
        this.estadoClinico = estadoClinico;
        this.especialidadQuirurgica = especialidadQuirurgica;
        this.cirujanoAsignado = cirujanoAsignado;
        this.ingresoListaEspera = ingresoListaEspera;
        this.posicionCola = posicionCola;
        this.telefono = telefono;
        this.numeroCatSalut = numeroCatSalut;
        this.notasAdicionales = notasAdicionales;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getPrioridadMedica() {
        return prioridadMedica;
    }

    public void setPrioridadMedica(int prioridadMedica) {
        if (prioridadMedica < 1 || prioridadMedica > 5) {
            throw new IllegalArgumentException("La prioridad médica debe estar entre 1 y 5.");
        }
        this.prioridadMedica = prioridadMedica;
    }

    public String getEstadoClinico() {
        return estadoClinico;
    }

    public void setEstadoClinico(String estadoClinico) {
        this.estadoClinico = estadoClinico;
    }

    public String getEspecialidadQuirurgica() {
        return especialidadQuirurgica;
    }

    public void setEspecialidadQuirurgica(String especialidadQuirurgica) {
        this.especialidadQuirurgica = especialidadQuirurgica;
    }

    public String getCirujanoAsignado() {
        return cirujanoAsignado;
    }

    public void setCirujanoAsignado(String cirujanoAsignado) {
        this.cirujanoAsignado = cirujanoAsignado;
    }

    public Date getIngresoListaEspera() {
        return ingresoListaEspera;
    }

    public void setIngresoListaEspera(Date ingresoListaEspera) {
        this.ingresoListaEspera = ingresoListaEspera;
    }

    public int getPosicionCola() {
        return posicionCola;
    }

    public void setPosicionCola(int posicionCola) {
        if (posicionCola < 0) {
            throw new IllegalArgumentException("La posición en la cola no puede ser negativa.");
        }
        this.posicionCola = posicionCola;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroCatSalut() {
        return numeroCatSalut;
    }

    public void setNumeroCatSalut(String numeroCatSalut) {
        this.numeroCatSalut = numeroCatSalut;
    }

    public String getNotasAdicionales() {
        return notasAdicionales;
    }

    public void setNotasAdicionales(String notasAdicionales) {
        this.notasAdicionales = notasAdicionales;
    }
}
