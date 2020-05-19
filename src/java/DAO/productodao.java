/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BE.productobe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro
 */
public class productodao {

    public productodao() {
    }
    
    public List<productobe> listadoPrductos(){
        List<productobe> lista = new ArrayList();
        Connection c = new bd().getMysql();
        String sql="select codigo,nombre,precio,stock,categoria from productos order by 1";
        try {
            PreparedStatement pst = c.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                productobe producto = new productobe();
                producto.setCodigo(rs.getString("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setCategoria(rs.getString("categoria"));
                
                
                lista.add(producto);
            }
            //cerrar base de datos
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(productodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
        
    }
    
     public List<productobe> ListaCodigo(productobe e){
        List<productobe> lista = new ArrayList();
        Connection c = new bd().getMysql();
        String sql="select *from productos where codigo=?";
        try {
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, e.getCodigo());
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                e.setCodigo(rs.getString("codigo"));
                e.setNombre(rs.getString("nombre"));
                e.setPrecio(rs.getDouble("precio"));
                e.setStock(rs.getInt("stock"));
                e.setCategoria(rs.getString("categoria"));
                
             
                lista.add(e);
            }
            //cerrar base de datos
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(productodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
        
    }
     
      public int registrar(productobe e){
        int r=0;
        String sql="insert into productos(codigo,nombre,precio,stock,categoria) values(?,?,?,?,?)";
        Connection c = new bd().getMysql();
        try{
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, e.getCodigo());
            pst.setString(2, e.getNombre());
            pst.setDouble(3, e.getPrecio());
            pst.setInt(4, e.getStock());
            pst.setString(5, e.getCategoria());
            
            
            r = pst.executeUpdate();
            c.close();
            
        }catch(Exception ex){
             Logger.getLogger(productodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
      
      public int actualizar(productobe e){
        int r=0;
        String sql="UPDATE productos set codigo=?,nombre=?,precio=?,stock=?,categoria=? where codigo=?";
        Connection c = new bd().getMysql();
        try{
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, e.getCodigo());
            pst.setString(2, e.getNombre());
            pst.setDouble(3, e.getPrecio());
            pst.setInt(4, e.getStock());
            pst.setString(5, e.getCategoria());
            r = pst.executeUpdate();
            c.close();
            
        }catch(Exception ex){
             Logger.getLogger(productodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
      
      
     public int eliminar(productobe e){
        int r=0;
        String sql="delete from productos where codigo=?";
        Connection c = new bd().getMysql();
        try{
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, e.getCodigo());
            r = pst.executeUpdate();
            c.close();
            
        }catch(Exception ex){
             Logger.getLogger(productodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     
   
    
    
}
