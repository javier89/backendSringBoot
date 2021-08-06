package academy.itz.lab.Alumnos.resource;

import academy.itz.lab.Alumnos.model.Alumnos;
import academy.itz.lab.Alumnos.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")

public class AlumnoResouce {
    private final AlumnoService alumnoService;

    public AlumnoResouce(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Alumnos>> getAllAlumnos(){
        List<Alumnos> alumnos = alumnoService.findAllAlumnos();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Alumnos> getAlumnosById(@PathVariable("id") Long id){
        Alumnos alumno = alumnoService.findAlumnoById(id);
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Alumnos> addAlumno(@RequestBody Alumnos alumnos){
        Alumnos alumno = alumnoService.addAlumno(alumnos);
        return new ResponseEntity<>(alumnos, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Alumnos> updateAlumno(@RequestBody Alumnos alumno){
        Alumnos updateAlumno = alumnoService.addAlumno(alumno);
        return new ResponseEntity<>(updateAlumno,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAlumnos (@PathVariable("id") Long id){
        alumnoService.deleteAlumno(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
