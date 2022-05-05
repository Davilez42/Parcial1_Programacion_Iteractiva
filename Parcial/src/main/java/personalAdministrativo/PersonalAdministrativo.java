/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalAdministrativo;

import empleado.Empleado;

/**
 *
 * @author usuario
 */
public class PersonalAdministrativo extends Empleado{
    String facultad,tecnologiasManejadas;
    public PersonalAdministrativo(String nombre, String cedula,String facultad,String tecnologiasManejadas) {
        super(nombre, cedula);
        this.facultad = facultad;
        this.tecnologiasManejadas = tecnologiasManejadas;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getTecnologiasManejadas() {
        return tecnologiasManejadas;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setTecnologiasManejadas(String tecnologiasManejadas) {
        this.tecnologiasManejadas = tecnologiasManejadas;
    }
    
    @Override
    public String GetInfo(){
         return "Nombre: " + getNombre() + "| Cedula: " + getCedula() + "| Facultad: " + facultad + "| Tecnologia Manejada: " + tecnologiasManejadas;
    }
}
