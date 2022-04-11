/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Valentina
 */
public class RegistroIngreso implements Serializable{
    private Date fechaHoraIngreso;
    
    private Vehiculo elVehiculo;
    private String codigo;
    public RegistroIngreso(Vehiculo elVehiculo, Date fechaHoraIngreso){
        this.elVehiculo = elVehiculo;
        this.fechaHoraIngreso = fechaHoraIngreso;
        
        this.codigo = elVehiculo.obtenerIdentificacion()+fechaHoraIngreso.getTime();
        
    }


    
    public Vehiculo obtenerVehiculo(){
        return this.elVehiculo;
    }
    public Vehiculo modificaVehiculo(Vehiculo elVehiculo){
        return this.elVehiculo;
    }
    
    
    public Date obtenerFechaHoraIngreso()
    {
        return this.fechaHoraIngreso;
    }
    public String getCodigo() {
        return codigo;
    }
    
    
    public void modificaFechaHoraIngreso(Date fechaHoraIngreso ){
    
        this.fechaHoraIngreso = fechaHoraIngreso;
    
    
    }    

    @Override
    public String toString() {
        return " codigo"+this.codigo+"\n vehiculo "+elVehiculo.obtenerPlaca()+"\n ingresa el dia"+this.fechaHoraIngreso;
       
    }
    
    
}
