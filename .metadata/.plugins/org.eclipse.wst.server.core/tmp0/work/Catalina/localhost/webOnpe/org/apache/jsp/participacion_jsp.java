/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-02-25 14:55:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class participacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 
	String id = (String) session.getAttribute("id");
	String[][] data = (String[][]) session.getAttribute("data");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html> \r\n");
      out.write("    <head>\r\n");
      out.write("        <title>ONPE - Oficina Nacional de Procesos Electorales</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"  /> \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" />\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>		\r\n");
      out.write("    </head>\r\n");
      out.write("	<body>\r\n");
      out.write("		");
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
      out.write("								\r\n");
      out.write("		<div id=\"imprimelo3\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<img src=\"images/fnd-participacion.jpg\" width=\"1170\" height=\"248\" class=\"img-responsive mg30top\">\r\n");
      out.write("\r\n");
      out.write("				<section class=\"menu navbar-default menu05\">\r\n");
      out.write("					<a name=\"posicion\"></a>\r\n");
      out.write("					<nav class=\"navbar-collapse bs-navbar-collapse collapse\" aria-expanded=\"false\">\r\n");
      out.write("						<ul class=\"nav navbar-nav\">\r\n");
      out.write("							<li class=\"bt-azul\">\r\n");
      out.write("								<a href=\"presidenciales.jsp\">PRESIDENCIAL</a>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"bt-amarillo\">\r\n");
      out.write("								<a href=\"actas.jsp\">ACTAS</a>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"bt-rojo act-rojo\">\r\n");
      out.write("								<a href=\"svlParticipacion\">PARTICIPACIÓN CIUDADANA</a>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</nav>\r\n");
      out.write("				</section>\r\n");
      out.write("\r\n");
      out.write("				<section class=\"contenedor\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-xs-12 col-md-3\">\r\n");
      out.write("							<div class=\"menu-interna\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li><a href=\"svlParticipacion\" class=\"act-izq\">TOTAL</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"col-xs-12 col-md-9\" id=\"impreso\">\r\n");
      out.write("							<div class=\"contenido-interna\">\r\n");
      out.write("								<div class=\"titulos col-xs-12\">\r\n");
      out.write("									<div class=\"col-xs-11\">\r\n");
      out.write("										<h3> <span class=\"glyphicon glyphicon-circle-arrow-right\" aria-hidden=\"true\" style=\"font-size:19px\"></span> SEGUNDA ELECCIÓN PRESIDENCIAL 2016: PARTICIPACIÓN CIUDADANA</h3>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-xs-1 oculto-boton-print\">\r\n");
      out.write("										<button><i class=\"fa fa-print ico-print\"></i></button>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								\r\n");
      out.write("								");
 if ( id != null ) { 
      out.write("\r\n");
      out.write("				                    <table>\r\n");
      out.write("				                        <tr>\r\n");
      out.write("				                            <td><button type=\"button\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span> REGRESAR</button></td>\r\n");
      out.write("				                            <td width=\"60%\">&nbsp;</td>\r\n");
      out.write("				                            <td><button type=\"button\" class=\"btn btn-primary\" onclick=\"#\">REPORTE DETALLADO EN EXCEL</button></td>\r\n");
      out.write("				                        </tr>\r\n");
      out.write("				                    </table>\r\n");
      out.write("								");
 }  
      out.write("\r\n");
      out.write("								\r\n");
      out.write("								<div class=\"col-xs-12\">\r\n");
      out.write("									<p class=\"subtitle\">ACTAS CONTABILIZADAS</p>\r\n");
      out.write("									<div class=\"col-lg-7 centered\">\r\n");
      out.write("										<div class=\"col-xs-12 col-md-12 col-lg-12 cont-curv\">\r\n");
      out.write("											<div class=\"col-xs-3 col-md-1\">\r\n");
      out.write("												<span class=\"glyphicon glyphicon-ok-circle ico-info\" aria-hidden=\"true\"></span>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-xs-9 col-md-11\">\r\n");
      out.write("												<ul>\r\n");
      out.write("													<li>ACTUALIZADO EL 20/06/2016 A LAS 19:16 h </li>\r\n");
      out.write("												</ul>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<br>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<div class=\"col-xs-12 line pbot30\">\r\n");
      out.write("									<div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("										<img src=\"images/estadistico.png\" class=\"img-responsive\">\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("										<p class=\"subtitle\">ELECTORES HÁBILES 22,901,954</p>\r\n");
      out.write("										<div id=\"page-wrap\">\r\n");
      out.write("											<table class=\"table09_2\" cellspacing=\"0\">\r\n");
      out.write("												<tr>\r\n");
      out.write("													<th>PARTICIPACIÓN</th>\r\n");
      out.write("													<th>AUSENTISMO</th>\r\n");
      out.write("												</tr>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<td>TOTAL: 18,342,896</td>\r\n");
      out.write("													<td>TOTAL: 4,559,058</td>\r\n");
      out.write("												</tr>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<td>% TOTAL: 80.093%</td>\r\n");
      out.write("													<td>% TOTAL: 19.907%</td>\r\n");
      out.write("												</tr>\r\n");
      out.write("											</table>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								\r\n");
      out.write("								");
 if ( id == null ) { 
      out.write("\r\n");
      out.write("									<div class=\"col-xs-12 pbot30 ptop20\">\r\n");
      out.write("										<div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("											<a href=\"svlParticipacion?id=extranjero\"><img src=\"images/icono_extranjero.jpg\" class=\"img-responsive\"></a>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("											<a href=\"svlParticipacion?id=nacional\"><img src=\"images/icono_nacional.jpg\" class=\"img-responsive\"></a>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("								");
 if ( id != null ) { 
      out.write("\r\n");
      out.write("									<div class=\"col-xs-12\">\r\n");
      out.write("										<p class=\"subtitle\">Consulta de participación DETALLADO </p>\r\n");
      out.write("										<div id=\"page-wrap\">\r\n");
      out.write("											<table class=\"table21\">\r\n");
      out.write("												<tbody>\r\n");
      out.write("				                                    <tr class=\"titulo_tabla\">\r\n");
      out.write("				                                        <td>");
      out.print( session.getAttribute("DPD") );
      out.write("</td>\r\n");
      out.write("				                                        <td>TOTAL ASISTENTES</td>\r\n");
      out.write("				                                        <td>% TOTAL ASISTENTES</td>\r\n");
      out.write("				                                        <td>TOTAL AUSENTES</td>\r\n");
      out.write("				                                        <td>% TOTAL AUSENTES</td>\r\n");
      out.write("				                                        <td>ELECTORES HÁBILES</td>\r\n");
      out.write("				                                    </tr>\r\n");
      out.write("				                                \r\n");
      out.write("				                                	");
 for ( String[] aData : data ) { 
      out.write("    \r\n");
      out.write("					                                    <tr>\r\n");
      out.write("					                                        <td>");
      out.print( aData[1] );
      out.write("</td>\r\n");
      out.write("					                                        <td>");
      out.print( aData[2] );
      out.write("</td>\r\n");
      out.write("					                                        <td>");
      out.print( aData[3] );
      out.write("</td>\r\n");
      out.write("					                                        <td>");
      out.print( aData[4] );
      out.write("</td>\r\n");
      out.write("					                                        <td>");
      out.print( aData[5] );
      out.write("</td>\r\n");
      out.write("					                                        <td>");
      out.print( aData[6] );
      out.write("</td>\r\n");
      out.write("					                                    </tr>\r\n");
      out.write("				                                    ");
 } 
      out.write("\r\n");
      out.write("				                                    <tr>\r\n");
      out.write("				                                        <td>TOTALES</td>	\r\n");
      out.write("				                                        <td>17,953,367</td> \r\n");
      out.write("				                                        <td>81.543%</td>\r\n");
      out.write("				                                        <td>4,063,663</td>\r\n");
      out.write("				                                        <td>18.457%</td>\r\n");
      out.write("				                                        <td>22,017,030</td>\r\n");
      out.write("				                                    </tr>\r\n");
      out.write("												</tbody>\r\n");
      out.write("											</table>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								");
 } 
      out.write("\r\n");
      out.write("													\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("				\r\n");
      out.write("					</div>\r\n");
      out.write("				</section>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"divDetalle\"></div>\r\n");
      out.write("		\r\n");
      out.write("		");
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
      out.write("	</body>\r\n");
      out.write("</html>");
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
