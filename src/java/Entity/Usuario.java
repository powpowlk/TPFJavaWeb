package Entity;
// Generated Jun 29, 2017 7:35:39 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int usuarioId;
     private Rol rol;
     private String nombre;
     private String email;
     private String contrasena;
     private String token;
     private Set invitacions = new HashSet(0);
     private Set reservas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    public Usuario(int usuarioId, Rol rol, String nombre, String email, String contrasena, Set invitacions, Set reservas) {
       this.usuarioId = usuarioId;
       this.rol = rol;
       this.nombre = nombre;
       this.email = email;
       this.contrasena = contrasena;
       this.invitacions = invitacions;
       this.reservas = reservas;
    }
   
    public int getUsuarioId() {
        return this.usuarioId;
    }
    
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Set getInvitacions() {
        return this.invitacions;
    }
    
    public void setInvitacions(Set invitacions) {
        this.invitacions = invitacions;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }
    
    public String getToken(){
        return this.token;
    }
    
    public void setToken(String token){
        this.token=token;
    }



}


