
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    static{
        try{
            // no tengo claro que e de poner en el configure
            sessionFactory= new org.hibernate.cfg.Configuration().configure("").buildSessionFactory();

        }catch(Throwable ex){
            System.err.println("Ocurrio un error en la inicializacion: "+"de la SessionFactory"+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException{
        return sessionFactory.openSession();
    }

    public static void shutdwon(){
        sessionFactory.close();
    }
}
