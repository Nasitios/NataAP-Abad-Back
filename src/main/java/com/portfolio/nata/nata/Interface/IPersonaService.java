/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.nata.nata.Interface;

import com.portfolio.nata.nata.Entity.Persona;
import java.util.List;

/**
 *
 * @author nata
 */
public interface IPersonaService {
   //Obtener datos de personas
    public  List<Persona> getPersona();
    
    //Guardar Persona
    public void savePersona(Persona persona);
    
    //Eliminar persona
    public void deletePersona (Long id);
    
    //Buscar Persona
    public Persona findPersona(Long id);     
     
}
