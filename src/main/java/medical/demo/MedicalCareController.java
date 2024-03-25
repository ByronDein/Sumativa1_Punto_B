package medical.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MedicalCareController {
    private List<MedicalCare> pacientes = new ArrayList<MedicalCare>();
    
    public MedicalCareController() {
        // Patient 1
        List<Attention> atenciones1 = new ArrayList<Attention>();
        atenciones1.add(new Attention(1, "2024-03-01", "Dr. Juan Perez", "Revision Brackets", "Revision general de la boca del paciente"));
        atenciones1.add(new Attention(2, "2024-03-02", "Dr. Juan Perez", "Revision Brackets", "rayos x de la boca del paciente"));
        atenciones1.add(new Attention(3, "2024-03-03", "Dr. Juan Perez", "Revision Brackets", "moldes de la boca del paciente para brackets"));
        List<MedicalHistory> historial1 = new ArrayList<MedicalHistory>();
        historial1.add(new MedicalHistory("Instalacion brackets", atenciones1));
        pacientes.add(new MedicalCare(1, "20.325.622-5", "Juan Perez", "J.Perez@duocuc.cl", "+56912345678", "Calle Violeta 12", historial1));

        // Patient 2
        List<Attention> atenciones2 = new ArrayList<Attention>();
        atenciones2.add(new Attention(4, "2024-03-09", "Dr. Maria Rodriguez", "Extraccion Muela", "Extraccion de muela del juicio superior derecha"));
        atenciones2.add(new Attention(5, "2024-03-15", "Dr. Maria Rodriguez", "Extraccion Muela", "Revision post-operatoria de extraccion de muela"));
        List<MedicalHistory> historial2 = new ArrayList<MedicalHistory>();
        historial2.add(new MedicalHistory("Extraccion muela", atenciones2));
        pacientes.add(new MedicalCare(2, "20.325.623-6", "Maria Rodriguez", "M.Rodriguez@duocuc.cl", "+56912345679", "Veracruz 12319", historial2));

        // Patient 3
        List<Attention> atenciones3 = new ArrayList<Attention>();
        atenciones3.add(new Attention(6, "2024-03-20", "Dr. Carlos Gomez", "Revision Estomacal", "Revision estomacal por dolores recurrentes"));
        atenciones3.add(new Attention(7, "2024-03-30", "Dr. Carlos Gomez", "Revision Estomacal", "Seguimiento de dolores estomacales, prescripcion de medicamentos"));
        List<MedicalHistory> historial3 = new ArrayList<MedicalHistory>();
        historial3.add(new MedicalHistory("Revision estomacal", atenciones3));
        pacientes.add(new MedicalCare(3, "20.325.624-7", "Carlos Gomez", "C.Gomez@duocuc.cl", "+56912345680", "Avenida Siempre Viva 742", historial3));

        // Patient 4
        List<Attention> atenciones4 = new ArrayList<Attention>();
        atenciones4.add(new Attention(8, "2024-03-11", "Dr. Ana Torres", "Revision Ocular", "Revision ocular por vision borrosa"));
        atenciones4.add(new Attention(9, "2024-03-15", "Dr. Ana Torres", "Revision Ocular", "Prescripcion de lentes para mejorar la vision"));
        List<MedicalHistory> historial4 = new ArrayList<MedicalHistory>();
        historial4.add(new MedicalHistory("Revision ocular", atenciones4));
        pacientes.add(new MedicalCare(4, "20.325.625-8", "Ana Torres", "A.Torres@duocuc.cl", "+56912345681", "Calle Los Alamos 123", historial4));

        // Patient 5
        List<Attention> atenciones5 = new ArrayList<Attention>();
        atenciones5.add(new Attention(10, "2024-03-6", "Dr. Pedro Martinez", "Revision Cardiaca", "Revision cardiaca por palpitaciones irregulares"));
        atenciones5.add(new Attention(11, "2024-03-14", "Dr. Pedro Martinez", "Revision Cardiaca", "Seguimiento de palpitaciones, prescripcion de medicamentos"));
        List<MedicalHistory> historial5 = new ArrayList<MedicalHistory>();
        historial5.add(new MedicalHistory("Revision cardiaca", atenciones5));
        pacientes.add(new MedicalCare(5, "20.325.626-9", "Pedro Martinez", "P.Martinez@duocuc.cl", "+56912345682", "Calle Los Pinos 456", historial5));
    }
    
    @GetMapping("/patients")
    public List<MedicalCare> getPacientes() {
        return pacientes;
    }

    @GetMapping("/patients/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        for (MedicalCare paciente : pacientes) {
            if (paciente.getId() == id) {
                return ResponseEntity.ok(paciente);
            }
        }
        Map<String, Object> response = new HashMap<>();
        response.put("id", "no encontrado");
        response.put("message", "No se Encontro el paciente con el id : " + id + " Por favor intente con un id diferente.");
        response.put("status", HttpStatus.NOT_FOUND);
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}
