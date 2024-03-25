package medical.demo;

import java.util.List;

public class MedicalHistory {
    private String diagnostico;
    private List<Attention> atenciones;

    public MedicalHistory( String diagnostico, List<Attention> atenciones) {
        this.diagnostico = diagnostico;
        this.atenciones = atenciones;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public List<Attention> getAtenciones() {
        return atenciones;
    }
    



    

    
}
