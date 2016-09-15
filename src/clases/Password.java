/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jaime
 */
public class Password {

    private String contraseña;
    private int longitud;

    public Password(String contraseña) {
        this.contraseña = contraseña;
        this.longitud = 8;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String Seguridad() {
        String aux;
        if (this.getContraseña().length() < 6) {
            aux = "Su contraseña es debil";
        } else {
            aux = "Su contraseña es fuerte";
        }
        return aux;
    }

    public void CambiarContraseña(String nuevacontraseña) {
        String nueva = nuevacontraseña;
        this.setContraseña(nueva);
    }

    public String Mostrar() {
        String aux = "Su contraseña es " + this.getContraseña();
        return aux;
    }

}
