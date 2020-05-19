<%-- 
    Document   : editar
    Created on : 03/05/2020, 01:38:55 PM
    Author     : Alvaro
--%>

<%@page import="BR.productobr"%>
<%@page import="java.util.List"%>
<%@page import="BE.productobe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String cod = request.getParameter("codigo");
    List<productobe> Lista; 
    productobr regla = new productobr();
    productobe entidad = new productobe();
    entidad.setCodigo(cod);
    Lista  = regla.ListaC(entidad);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="card-body" >
           <%
              for(productobe e:Lista){
             %>
           
             <div class="container mt-3">
                 <div class="card-header">
                     <form  method="post" >
                        
                        <div class="form-row" >
                            <div class="form-group col-md-2"> 
                                <label for="txtcodigo">Codigo de Producto</label>
                                   
                            </div>
                            <div class="form-group col-md-3"> 
                                     <input type="text" name="txtcodigo" class="form-control" value="<%=e.getCodigo()%>">
                            </div>
                            
                        </div>
                         <div class="form-row" >
                            <div class="form-group col-md-2"> 
                                 <label >Nombre de Producto</label>
                                   
                            </div>
                            <div class="form-group col-md-3"> 
                                    <input type="text" name="txtnombre" class="form-control" value="<%=e.getNombre()%>">
                            </div>
                            
                        </div>
                         <div class="form-row" >
                            <div class="form-group col-md-2"> 
                                 <label >Precio Unitario</label>
                                   
                            </div>
                            <div class="form-group col-md-3"> 
                                    <input type="text" name="txtprecio" class="form-control" value="<%=e.getPrecio()%>">
                            </div>
                            
                        </div>
                        <div class="form-row" >
                            <div class="form-group col-md-2"> 
                                 <label>Stock</label>
                                   
                            </div>
                            <div class="form-group col-md-3"> 
                                    <input type="text" name="txtstock" class="form-control" value="<%=e.getStock()%>">
                            </div>
                            
                        </div>
                       <div class="form-row" >
                            <div class="form-group col-md-2"> 
                                 <label>Categoria</label>
                                   
                            </div>
                            <div class="form-group col-md-3"> 
                                <select class="form-control" name="txtcategoria" type="text" value="<%=e.getCategoria()%>">
                                    <option>Abarrote</option>
                                    <option>Oficina</option>
                                    <option>Hogar</option>
                                </select>
                                
                            </div>
                            
                        </div>
                     
                      
                        <input href="edit.jsp>" type="submit" value="Grabar"  class="btn btn-primary">
                        <input type="button" value="Volver" class="btn btn-primary" onclick="location.href='Listar.jsp'">
                    </form>
                     
                 </div>
             </div>
                
                    
                            
            <%
            }
              
             %>   
                            
                            
                            
                </div>
    </body>
</html>
