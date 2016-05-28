package guiaturistica.Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Mantiene la coneccion con mysql mediante JPA
 *
 * @author sandrojc
 */

public class JPAUtil {

    private static final EntityManagerFactory emf;
    private static final String persistence_name = "GuiaTuristica";

    static {
        emf = Persistence.createEntityManagerFactory(persistence_name, null);
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}