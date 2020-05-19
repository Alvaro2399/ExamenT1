<%-- 
    Document   : registrar
    Created on : 03/05/2020, 12:55:06 PM
    Author     : Alvaro
--%>

<%@page import="BR.productobr"%>
<%@page import="BE.productobe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="Listar.jsp"></a>
<%
    productobe entidad = new productobe();
    entidad.setCodigo(request.getParameter("txtcodigo"));
    entidad.setNombre(request.getParameter("txtnombre"));
    entidad.setPrecio(Double.parseDouble(request.getParameter("txtprecio")));
    entidad.setStock(Integer.valueOf(request.getParameter("txtstock")));
    entidad.setCategoria(request.getParameter("txtcategoria"));
    
    int r = new productobr().nuevo(entidad);
    
    request.getRequestDispatcher("Listar.jsp").forward(request, response);

%>