package medical.demo;

import java.util.List;

public class MedicalCare {
    private int id;
    private String rut;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private List<MedicalHistory> historialMedico;
    
    

    public MedicalCare( int id, String rut, String nombre, String correo, String telefono, String direccion, List<MedicalHistory> historialMedico) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.historialMedico = historialMedico;
    }



    public int getId() {
        return id;
    }



    public String getRut() {
        return rut;
    }



    public String getNombre() {
        return nombre;
    }



    public String getCorreo() {
        return correo;
    }



    public String getTelefono() {
        return telefono;
    }



    public String getDireccion() {
        return direccion;
    }



    public List<MedicalHistory> getHistorialMedico() {
        return historialMedico;
    }


    

    
}
