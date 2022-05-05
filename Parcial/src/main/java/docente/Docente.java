/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docente;

import empleado.Empleado;

/**
 *
 * @author usuario
 */
public class Docente extends Empleado{
    
    int papersPublicados;
    Gradoacademico grd;
    String asignatura;
    public Docente(String nombre, String cedula,int papersPublicados,Gradoacademico grd,String asignatura ) {
        super(nombre, cedula);
        
        this.papersPublicados = papersPublicados;
       this.grd = grd;
       this.asignatura = asignatura;
    }
    
    @Override
    public  String GetInfo(){
        return "Nombre: " + getNombre() + "| Cedula: " + getCedula() +"| Grado Acad: " + grd +"| Papers :" + papersPublicados + "| Asignatura: "+ asignatura;
    }

    public void setPapersPublicados(int papersPublicados) {
        this.papersPublicados = papersPublicados;
    }

    public void setGrd(Gradoacademico grd) {
        this.grd = grd;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getPapersPublicados() {
        return papersPublicados;
    }

    public Gradoacademico getGrd() {
        return grd;
    }

    public String getAsignatura() {
        return asignatura;
    }
    
}
