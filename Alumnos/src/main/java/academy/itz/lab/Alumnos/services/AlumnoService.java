package academy.itz.lab.Alumnos.services;

import academy.itz.lab.Alumnos.exception.UserNotFoundException;
import academy.itz.lab.Alumnos.model.Alumnos;
import academy.itz.lab.Alumnos.repo.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional

public class AlumnoService {

    private final AlumnoRepo alumnoRepo;

    @Autowired
    public AlumnoService(AlumnoRepo alumnoRepo){
       this.alumnoRepo = alumnoRepo;
    }

    public Alumnos addAlumno(Alumnos alumnos){
        alumnos.setAlumnoCode(UUID.randomUUID().toString());
        return alumnoRepo.save(alumnos);
    }

    public List<Alumnos> findAllAlumnos(){
        return alumnoRepo.findAll();
    }

    public Alumnos updateAlumnos(Alumnos alumnos){
        return alumnoRepo.save(alumnos);
    }

    public Alumnos findAlumnoById(Long id){
        return alumnoRepo.findAlumnoById(id)
                .orElseThrow(
                () -> new UserNotFoundException("User by id" + id + "was not found")
        );
    }

    public void deleteAlumno(Long id){
        alumnoRepo.deleteAlumnoById(id);
    }
}
