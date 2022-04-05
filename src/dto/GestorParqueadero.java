/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author Valentina
 */
public class GestorParqueadero {
    private String placa;
    private Date fecha;
    private float horaIngreso;
    private int identificacion;
    
    
    public String obtenerPlaca(){
        return this.placa;
    }
    public Date obtenerFecha(){
        return this.fecha;
    }
    public float obtenerHoraIngreso(){
        return this.horaIngreso;
    }
    public int obtenerIdentificacion(){
        return this.identificacion;
    }
    public String entradaVehiculo(){
        return null;
    }
    public String salidaVehiculo(){
        return null;
    }
    
    
}
