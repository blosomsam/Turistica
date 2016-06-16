package guiaturistica;

import guiaturistica.Util.JPAUtil;
import guiaturistica.controlador.CuentaJpaControl;
import guiaturistica.controlador.UsuarioJpaControl;
import guiaturistica.modelo.Cuenta;
import guiaturistica.modelo.Usuario;
import guiaturistica.vista.AutentificacionUsuarios;
import java.util.Date;

/**
 * @author sandrojc
 */
public class GuiaTuristica {
    
    public static void main(String[] args) {
        
        //AUTENTIFICACIÓN DE USUARIOS
        AutentificacionUsuarios au = new AutentificacionUsuarios(null, true);
        au.setVisible(true);
        
        //CREAR UN USUARIO ADMINISTRADOR CON CONTRASEÑA
//        Cuenta cu = new Cuenta();
//        cu.setNombreUsuario("blosom");
//        cu.setClaveUsuario("1234");
//        cu.setEstado("activo");
//        cu.setFechaCreacion(new Date());
//        cu.setFechaModificacion(new Date());
//
//        UsuarioJpaControl usc = new UsuarioJpaControl(JPAUtil.getEntityManagerFactory());
//        Usuario us = new Usuario();
//        us.setNombres("Sandro");
//        us.setApellidos("Castillo");  
//        us.setCedula("1900547496");
//        us.setEmail("blosom@gmail.com");
//        us.setDireccion("loja");
//        us.setFechaNacimieto(new Date());
//        us.setNacionalidad("Ecuatoriana");
//        us.setTelCelularUsuario("0999887766");
//        us.setTelefonoCasaUsuario("230044");
//        us.setTelefono("230032");
//        
//        us.setCuenta(cu);
//        usc.crear(us);     

//notas el restaurant se autogenera 
    }
}