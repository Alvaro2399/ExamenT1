package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BR.productobr;
import java.util.List;
import BE.productobe;

public final class Listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            List<productobe> lista;
            productobr regla = new productobr();
            lista = regla.listar();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div style=\"background-color: #808080 ; color: white\">\n");
      out.write("            <img width=\"300\" alt=\"yo\" src=\"img/descarga.png\" alt=\"\"/>\n");
      out.write("            <th>CURSO</th>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            <center>\n");
      out.write("                <p style=\"background-color: #000000 ; color: white\">Registro de Productos</p>\n");
      out.write("            </center>\n");
      out.write("        \n");
      out.write("        <div class=\"container mt-3\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"card-header\" >\n");
      out.write("                    <form action=\"registrar.jsp\"  method=\"post\" >\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                <label>Codigo de Producto</label>\n");
      out.write("                                   \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-3\"> \n");
      out.write("                                <input type=\"text\" name=\"txtcodigo\" class=\"form-control\" required=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                <label>Nombre de Producto</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-7\"> \n");
      out.write("                                <input type=\"text\" name=\"txtnombre\" class=\"form-control\" required=\"\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                <input type=\"submit\" value=\"Grabar\" class=\"btn btn-primary\" >\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                       <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                <label>Precio Unitario</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                <input type=\"text\" name=\"txtprecio\" class=\"form-control\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"form-group col-md-1\"> \n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"form-group col-md-1\"> \n");
      out.write("                                <label>Stock</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-3\"> \n");
      out.write("                                <input type=\"text\" name=\"txtstock\" class=\"form-control\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                 <label>Categoria</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                  <select class=\"form-control\" name=\"txtcategoria\" type=\"text\" required=\"\">\n");
      out.write("                                     <option>Abarrote</option>\n");
      out.write("                                     <option>Oficina</option>\n");
      out.write("                                     <option>Hogar</option>\n");
      out.write("                                 </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group col-md-10\">  \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-md-2\"> \n");
      out.write("                                <br>\n");
      out.write("                                  <input  type=\"submit\" value=\"Agregar\" class=\"btn btn-primary\" >\n");
      out.write("                                   \n");
      out.write("                            </div>\n");
      out.write("                   </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <table class=\"table table-bordered\" >\n");
      out.write("                        <thead >\n");
      out.write("                            <tr class=\"bg-warning\">\n");
      out.write("                                <th>Codigo</th>\n");
      out.write("                                <th>Nombre</th>\n");
      out.write("                                <th>Precio</th>\n");
      out.write("                                <th>Stock</th>\n");
      out.write("                   \n");
      out.write("                                <th width=\"15%\"></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                          ");

                    for(productobe entidad:lista){
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(entidad.getCodigo());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(entidad.getNombre());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(entidad.getPrecio());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(entidad.getStock());
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <td>\n");
      out.write("                                \n");
      out.write("                                <a href=\"editar.jsp?codigo=");
      out.print(entidad.getCodigo());
      out.write("\" class=\"btn btn-success\">Edit</a>\n");
      out.write("                                <a href=\"eliminar.jsp?codigo=");
      out.print(entidad.getCodigo());
      out.write("\" class=\"btn btn-warning\">Delete</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
