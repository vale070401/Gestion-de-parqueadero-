/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import utilidades.GestorPersistencia;

/**
 *
 * @author Valentina
 */
public class GestorParqueadero{
    private Map<String, RegistroIngreso> listaVehiculos;
    public GestorParqueadero(){
        if (listaVehiculos == null){
            listaVehiculos = (Map<String, RegistroIngreso> )GestorPersistencia.recuperar();
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
            //ri.modificaIdentificacion(identificacion);
            //ri.modificaVehiculo(elVehiculo);
            listaVehiculos.put(ri.getCodigo(),ri);
            GestorPersistencia.guardar(listaVehiculos);
             return ri; 
            
            
        }
        
            
        
    }
    private Vehiculo crearVehiculo(String placa,String identifiacion)
    {
        Vehiculo v = new Vehiculo();
        v.modificaPlaca( placa);
        v.modificaIdentificacion(identifiacion);
        return v;
    }
    public Map<String, RegistroIngreso> obtenerLista(){
        return (Map<String, RegistroIngreso>) this.listaVehiculos;
    }

    

    

   

    
        
    
    
    
}
