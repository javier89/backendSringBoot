package academy.itz.lab.Alumnos.repo;

import academy.itz.lab.Alumnos.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlumnoRepo extends JpaRepository<Alumnos, Long> {
    void deleteAlumnoById(Long id);

    Optional<Alumnos> findAlumnoById(Long id);
}
