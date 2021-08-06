package academy.itz.lab.Alumnos.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Alumnos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String namePrep;
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String alumnoCodigo;

    public Alumnos(){}

    public Alumnos(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.namePrep = namePrep;
        this.imageUrl = imageUrl;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getNamePrep(){ return namePrep;}

    public void setNamePrep(String namePrep){ this.namePrep = namePrep;}

    public String getImageUrl(){ return imageUrl;}

    public void setImageUrl(String imageUrl){ this.imageUrl = imageUrl;}

    public String getAlumnoCode(){
        return alumnoCodigo;
    }

    public void setAlumnoCode(String alumnoCodigo){
        this.alumnoCodigo = alumnoCodigo;
    }

    @Override
    public String toString(){
        return "Alumno{" +
                "id=" + id +
                ", name=' " + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" +  phone + '\'' +
                ", namePrep='" + namePrep + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}

