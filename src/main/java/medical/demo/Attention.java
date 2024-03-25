package medical.demo;

public class Attention {
    private int id;
    private String fechaConsulta;
    private String nombreDoctor;
    private String propositoConsulta;
    private String observaciones;

    public Attention(int id,String fechaConsulta, String nombreDoctor, String propositoConsulta, String observaciones) {
        this.id = id;
        this.fechaConsulta = fechaConsulta;
        this.nombreDoctor = nombreDoctor;
        this.propositoConsulta = propositoConsulta;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }
    
    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getPropositoConsulta() {
        return propositoConsulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    
}
