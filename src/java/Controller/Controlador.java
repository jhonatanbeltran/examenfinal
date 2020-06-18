/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidad.Persona;
import Entidad.Basico;
import config.Conexion;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JHONATAN
 */ 
@Controller
public class Controlador {
    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar()); 
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql = "select * from persona";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("index");
        return mav; 
    
    }
    
  
    
     @RequestMapping(value = "datospersonales.htm", method = RequestMethod.GET)
    public  ModelAndView Agregarr(){
        mav.addObject(new Basico());
        mav.setViewName("datospersonales");
        return mav;
    
    }
    
    @RequestMapping(value = "datospersonales.htm", method = RequestMethod.POST)
    public  ModelAndView Agregarr(Basico b){
    
        String sql ="INSERT into basico(documento, nombre, telefono, fechanacimiento, genero, eps, modalidad, tipo,"
                + "embarazo, contactonombre, contactotelefono)values(?,?,?,?,?,?,?,?,?,"
                + "?,?)";
         this.jdbcTemplate.update(sql,b.getDocumento(),b.getNombre(),b.getTelefono(),b.getFechaNacimiento(),b.getGenero(),
                 b.getEps(), b.getModalidad(),b.getTipo(), b.getEmbarazo(),b.getContactoNombre(),b.getContactoTelefono());
         return new ModelAndView("redirect:/---");
    
    
    
    }
    
    
}
