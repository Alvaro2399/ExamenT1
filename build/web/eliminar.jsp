<%-- 
    Document   : eliminar
    Created on : 03/05/2020, 12:31:50 PM
    Author     : Alvaro
--%>

<%@page import="BR.productobr"%>
<%@page import="BE.productobe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="Listar.jsp"></a>
<%
   String ide = request.getParameter("codigo");
   productobe entidad = new productobe();
   entidad.setCodigo(ide);
   new productobr().eliminar(entidad);
   request.getRequestDispatcher("Listar.jsp").forward(request, response);
%>
