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
public class Vehiculo implements Serializable {
    private String placa;
    private String identificacion;
    
    public String obtenerIdentificacion()
    {
        return this.identificacion;
    }
    public void modificaIdentificacion(String identificacion)
    {
        this.identificacion = identificacion;
    }

    public String obtenerPlaca()
    {
        return this.placa;
    }
    public void modificaPlaca(String placa)
    {
        this.placa = placa;
    }
    
}
