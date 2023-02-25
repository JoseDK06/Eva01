/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-02-25 14:55:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/header.jsp", Long.valueOf(1677336933416L));
    _jspx_dependants.put("/WEB-INF/footer.jsp", Long.valueOf(1677244400229L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" <!DOCTYPE html> \r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>ONPE - Oficina Nacional de Procesos Electorales</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"  /> \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" />\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>		\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    	");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"pull-left logo-onpe\">\r\n");
      out.write("            <div class=\"pull-left\"><a href=\"index.jsp\"><img src=\"images/onpe-trans.png\"></a></div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"pull-left\">\r\n");
      out.write("                <h1>PRESENTACIÓN DE RESULTADOS</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pull-right logo\">\r\n");
      out.write("            <img src=\"images/eegg2016-trans.png\" width=\"218\" height=\"35\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"container space02 nosub\">\r\n");
      out.write("            <div class=\"pull-left pd02 ancho-ie\">\r\n");
      out.write("                <a href=\"presidenciales.jsp\">\r\n");
      out.write("                    <div class=\"grow pic btn01\"><img src=\"images/presidenciales.jpg\" ></div>\r\n");
      out.write("                    <div class=\"tit02\"><span class=\"glyphicon glyphicon-chevron-down\" aria-hidden=\"true\"></span><p>PRESIDENCIALES</p></div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pull-left pd02 oculto2 ancho-ie\">\r\n");
      out.write("                <a href=\"actas.jsp\">\r\n");
      out.write("                    <div class=\"grow pic btn04\"><img src=\"images/actas.jpg\" ></div>\r\n");
      out.write("                <div class=\"tit02\"><span class=\"glyphicon glyphicon-chevron-down\" aria-hidden=\"true\"></span><p>ACTAS</p></div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pull-left pd01 ancho-ie\">\r\n");
      out.write("                <a href=\"svlParticipacion\">\r\n");
      out.write("                    <div class=\"grow pic btn05\"><img src=\"images/participacion.jpg\" ></div>\r\n");
      out.write("                <div class=\"tit01\"><span class=\"glyphicon glyphicon-chevron-down\" aria-hidden=\"true\"></span><p>PARTICIPACIÓN <br> CIUDADANA</p></div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write(" <footer class=\"footer-inside\">\r\n");
      out.write("      <div class=\"container \">\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("	   <div class=\"col-md-12 direc01\">\r\n");
      out.write("		   <span>CONTÁCTENOS</span>\r\n");
      out.write("		   <p>Jr. Washington 1894, Cercado de Lima </p>\r\n");
      out.write("		   <p>Correo electrónico: <a href=\"mailto:informes@onpe.gob.pe\">informes@onpe.gob.pe</a></p>\r\n");
      out.write("		   <p>Central Telefónica: 417 - 0630 / Lunes a Viernes 08:30 - 16:30 hrs</p>\r\n");
      out.write("	   </div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("    </body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
