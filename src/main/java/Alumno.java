
import javax.persistence.*;



@Entity
@Table(name="alumno")


public class Alumno {
    private Integer id;
    private String nombre;
    //java.util.Date fecha = new Date();
    private String fecha;
    private String evento;
    private Integer hora;
    private String lugar;

    public Alumno(String nombre,String fecha,String evento,Integer hora,String lugar){
       this.nombre=nombre;
       this.fecha=fecha;
       this.evento=evento;
       this.hora=hora;
       this.lugar=lugar;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  Integer getId(){ return this.id;}

    public void setId(Integer id){this.id=id;}

    public String getNombre(){return this.nombre;}

    public void setNombre(String Nombre){this.nombre=Nombre;}

    public String getfecha(){return this.fecha;}

    public void setFecha(String Fecha){this.fecha=Fecha;}

    public String getEvento(){return this.evento;}

    public void setEvento(String Evento){this.evento=Evento;}

    public Integer getHora(){return this.hora;}

    public void setHora(Integer Hora){this.hora=hora;}

    public String getLugar(){return this.lugar;}

    public void setLugar(String Lugar){this.lugar=Lugar;}


@Override
    public String toString(){
        return "Alumno{"+
            "nombre"+nombre+ '\''+
            "fecha"+fecha+ '\''+
            "Evento"+evento+ '\''+
            "Hora"+hora+ '\''+
            "lugar"+lugar+ '\''+
            '}';
    }
}