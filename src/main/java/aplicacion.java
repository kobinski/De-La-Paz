import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.List;

public class aplicacion {

    public static void main (String...args) throws Exception{
        Class.forName("");
        Session session= HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
     //la fecha se recoje como string y si es necesario se parsea a un date
        //www.lawebdelprogramador.com/foros/java/1539642-Introducir-Fecha.html
        Alumno al1= new Alumno("Airam","18-03-2018","cena en casa",20,"heraclio sanchez la laguna");

        //guardar todo
        session.save(al1);
        //eliminar
        session.delete(al1);
        //actualizar
        al1.setNombre("Airam");
        session.update(al1);

        //consulta
        List<Alumno> registrosList= (List<Alumno>)session.createQuery("from Alumno").list();
        System.out.println(Arrays.toString(registrosList.toArray()));

        tx.commit();
        session.close();

        HibernateUtil.shutdwon();

    }

}
