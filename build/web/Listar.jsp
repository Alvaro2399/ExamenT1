<%-- 
    Document   : Listar
    Created on : 03/05/2020, 11:53:52 AM
    Author     : Alvaro
--%>

<%@page import="BR.productobr"%>
<%@page import="java.util.List"%>
<%@page import="BE.productobe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            List<productobe> lista;
            productobr regla = new productobr();
            lista = regla.listar();
        %>
        
        <div style="background-color: #808080 ; color: white">
            <img width="300" alt="yo" src="img/descarga.png" alt=""/>
            <th>CURSO</th>
            
        </div>
            <center>
                <p style="background-color: #000000 ; color: white">Registro de Productos</p>
            </center>
        
        <div class="container mt-3">
            <div class="card">
                
                
                <div class="card-header" >
                    <form action="registrar.jsp"  method="post" >
                        <div class="form-row">
                            <div class="form-group col-md-2"> 
                                <label>Codigo de Producto</label>
                                   
                            </div>
                            <div class="form-group col-md-3"> 
                                <input type="text" name="txtcodigo" class="form-control" required="" >
                            </div>
                            
                        </div>
                            
                        <div class="form-row">
                            <div class="form-group col-md-2"> 
                                <label>Nombre de Producto</label>
                            </div>
                            <div class="form-group col-md-7"> 
                                <input type="text" name="txtnombre" class="form-control" required="" >
                            </div>
                            <div class="form-group col-md-2"> 
                                <input type="submit" value="Grabar" class="btn btn-primary" >
                                
                            </div>
                        </div>
                        
                       <div class="form-row">
                            <div class="form-group col-md-2"> 
                                <label>Precio Unitario</label>
                            </div>
                            <div class="form-group col-md-2"> 
                                <input type="text" name="txtprecio" class="form-control" required="">
                            </div>
                           <div class="form-group col-md-1"> 
                            </div>
                           <div class="form-group col-md-1"> 
                                <label>Stock</label>
                            </div>
                            <div class="form-group col-md-3"> 
                                <input type="text" name="txtstock" class="form-control" required="">
                            </div>
                           
                        </div>
                        
                        <div class="form-row">
                            <div class="form-group col-md-2"> 
                                 <label>Categoria</label>
                            </div>
                            <div class="form-group col-md-2"> 
                                  <select class="form-control" name="txtcategoria" type="text" required="">
                                     <option>Abarrote</option>
                                     <option>Oficina</option>
                                     <option>Hogar</option>
                                 </select>
                            </div>
                        </div>
                       
                        
                        
                        
                        
                    </form>
                </div>
               
                <div>
                    <div class="form-row">
                            <div class="form-group col-md-10">  
                            </div>
                            <div class="form-group col-md-2"> 
                                <br>
                                  <input  type="submit" value="Agregar" class="btn btn-primary" >
                                   
                            </div>
                   </div>
                    
                </div>
                
                <div class="card-body">
                    <table class="table table-bordered" >
                        <thead >
                            <tr class="bg-warning">
                                <th>Codigo</th>
                                <th>Nombre</th>
                                <th>Precio</th>
                                <th>Stock</th>
                   
                                <th width="15%"></th>
                            </tr>
                        </thead>
                        <tbody>
                          <%
                    for(productobe entidad:lista){
                        %>
                        <tr>
                            <td><%=entidad.getCodigo()%></td>
                            <td><%=entidad.getNombre()%></td>
                            <td><%=entidad.getPrecio()%></td>
                            <td><%=entidad.getStock()%></td>
                            
                            
                            
                            <td>
                                
                                <a href="editar.jsp?codigo=<%=entidad.getCodigo()%>" class="btn btn-success">Edit</a>
                                <a href="eliminar.jsp?codigo=<%=entidad.getCodigo()%>" class="btn btn-warning">Delete</a>
                            </td>
                        </tr>
                        <%
                    }
                %>
                        </tbody>
                        
                    </table>
                </div>
                
            </div>
            
        </div>
    </body>
</html>
