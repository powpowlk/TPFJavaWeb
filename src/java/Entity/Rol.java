package Entity;
// Generated Jun 29, 2017 7:35:39 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private int rolId;
     private String rol;
     private Set usuarios = new HashSet(0);

    public Rol() {
    }

	
    public Rol(int rolId) {
        this.rolId = rolId;
    }
    public Rol(int rolId, String rol, Set usuarios) {
       this.rolId = rolId;
       this.rol = rol;
       this.usuarios = usuarios;
    }
   
    public int getRolId() {
        return this.rolId;
    }
    
    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


