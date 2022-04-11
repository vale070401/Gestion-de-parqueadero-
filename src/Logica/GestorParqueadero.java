/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import utilidades.GestorPersistencia1;
import dto.RegistroIngreso;
import dto.RegistroIngreso;
import dto.Vehiculo;
import dto.Vehiculo;
import java.io.Serializable;

/**
 *
 * @author Valentina
 */
public class GestorParqueadero implements Serializable{
    private Map<String, RegistroIngreso> listaVehiculos;
    public GestorParqueadero(){
        if (listaVehiculos == null){
            listaVehiculos = (Map<String, RegistroIngreso> )GestorPersistencia1.recuperar();
            if (listaVehiculos == null){
                listaVehiculos = new HashMap<>();
            }
        }
    }
    
    
    public RegistroIngreso crearIngreso(String placa, String identificacion, Date fechaHoraIngreso )
    {
        if (placa == null || identificacion == null || fechaHoraIngreso == null || placa.isEmpty() || identificacion.isEmpty())
        {
            return null;
              
        }
        else 
        {
            Vehiculo elVehiculo = this.crearVehiculo(placa,identificacion);
            RegistroIngreso ri = new RegistroIngreso(elVehiculo,fechaHoraIngreso);
            //ri.modificaFechaHoraIngreso(fechaHoraIngreso);
        
            //ri.modificaVehiculo(elVehiculo);
            //System.out.println(ri);
            listaVehiculos.put(ri.getCodigo(),ri);
            GestorPersistencia1.guardar(listaVehiculos);
             return ri; 
            
            
        }   
    }
    private Vehiculo crearVehiculo(String placa,String identificacion)
    {
        Vehiculo v = new Vehiculo();
        v.modificaIdentificacion(identificacion);
        v.modificaPlaca( placa);
        return v;
    }
    public Map<String, RegistroIngreso> obtenerLista(){
        return (Map<String, RegistroIngreso>) this.listaVehiculos;
    }
}
    
   

 

    

   

    
        
    
    
    

