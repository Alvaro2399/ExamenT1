<%-- 
    Document   : edit
    Created on : 04/05/2020, 06:47:50 PM
    Author     : Alvaro
--%>

<%@page import="BR.productobr"%>
<%@page import="BE.productobe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="editar.jsp"></a>
<%
    
    productobe entidad = new productobe();
    entidad.setCodigo(request.getParameter("txtcodigo"));
    entidad.setNombre(request.getParameter("txtnombre"));
    entidad.setPrecio(Double.parseDouble(request.getParameter("txtprecio")));
    entidad.setStock(Integer.valueOf(request.getParameter("txtstock")));
    entidad.setCategoria(request.getParameter("txtcategoria"));
    
    int r = new productobr().actualizardatos(entidad);
    
    request.getRequestDispatcher("editar.jsp").forward(request, response);

%>