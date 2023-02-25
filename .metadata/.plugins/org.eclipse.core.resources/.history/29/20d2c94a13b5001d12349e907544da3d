<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	String id = (String) session.getAttribute("id");
	String[][] data = (String[][]) session.getAttribute("data");
%>


<!DOCTYPE html> 
    <head>
        <title>ONPE - Oficina Nacional de Procesos Electorales</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"  /> 
        <meta http-equiv="X-UA-Compatible" content="IE=9" />
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="screen"/>		
    </head>
	<body>
		<%@include file="WEB-INF/header.jsp" %>
								
		<div id="imprimelo3">
			<div class="container">
				<img src="images/f-participacion.jpg" width="1170" height="248" class="img-responsive mg30top">

				<section class="menu navbar-default menu05">
					<a name="posicion"></a>
					<nav class="navbar-collapse bs-navbar-collapse collapse" aria-expanded="false">
						<ul class="nav navbar-nav">
							<li class="bt-azul">
								<a href="presidenciales.jsp">PRESIDENCIAL</a>
							</li>
							<li class="bt-amarillo">
								<a href="actas.jsp">ACTAS</a>
							</li>
							<li class="bt-rojo act-rojo">
								<a href="svlParticipacion">PARTICIPACIÓN CIUDADANA</a>
							</li>
						</ul>
					</nav>
				</section>

				<section class="contenedor">
					<div class="row">
						<div class="col-xs-12 col-md-3">
							<div class="menu-interna">
								<ul>
									<li><a href="svlParticipacion" class="act-izq">TOTAL</a></li>
								</ul>
							</div>
						</div>
						
						<div class="col-xs-12 col-md-9" id="impreso">
							<div class="contenido-interna">
								<div class="titulos col-xs-12">
									<div class="col-xs-11">
										<h3> <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true" style="font-size:19px"></span> SEGUNDA ELECCIÓN PRESIDENCIAL 2016: PARTICIPACIÓN CIUDADANA</h3>
									</div>
									<div class="col-xs-1 oculto-boton-print">
										<button><i class="fa fa-print ico-print"></i></button>
									</div>
								</div>
								
								<% if ( id != null ) { %>
				                    <table>
				                        <tr>
				                            <td><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> REGRESAR</button></td>
				                            <td width="60%">&nbsp;</td>
				                            <td><button type="button" class="btn btn-primary" onclick="#">REPORTE DETALLADO EN EXCEL</button></td>
				                        </tr>
				                    </table>
								<% }  %>
								
								<div class="col-xs-12">
									<p class="subtitle">ACTAS CONTABILIZADAS</p>
									<div class="col-lg-7 centered">
										<div class="col-xs-12 col-md-12 col-lg-12 cont-curv">
											<div class="col-xs-3 col-md-1">
												<span class="glyphicon glyphicon-ok-circle ico-info" aria-hidden="true"></span>
											</div>
											<div class="col-xs-9 col-md-11">
												<ul>
													<li>ACTUALIZADO EL 20/06/2016 A LAS 19:16 h </li>
												</ul>
											</div>
										</div>
									</div>
									<br>
								</div>

								<div class="col-xs-12 line pbot30">
									<div class="col-xs-12 col-md-6">
										<img src="images/estadistico.png" class="img-responsive">
									</div>
									<div class="col-xs-12 col-md-6">
										<p class="subtitle">ELECTORES HÁBILES 22,901,954</p>
										<div id="page-wrap">
											<table class="table09_2" cellspacing="0">
												<tr>
													<th>PARTICIPACIÓN</th>
													<th>AUSENTISMO</th>
												</tr>
												<tr>
													<td>TOTAL: 18,342,896</td>
													<td>TOTAL: 4,559,058</td>
												</tr>
												<tr>
													<td>% TOTAL: 80.093%</td>
													<td>% TOTAL: 19.907%</td>
												</tr>
											</table>
										</div>
									</div>
								</div>
								
								<% if ( id == null ) { %>
									<div class="col-xs-12 pbot30 ptop20">
										<div class="col-xs-12 col-md-6">
											<a href="svlParticipacion?id=extranjero"><img src="images/icono_extranjero.jpg" class="img-responsive"></a>
										</div>
										<div class="col-xs-12 col-md-6">
											<a href="svlParticipacion?id=nacional"><img src="images/icono_nacional.jpg" class="img-responsive"></a>
										</div>
									</div>
								<% } %>

								<% if ( id != null ) { %>
									<div class="col-xs-12">
										<p class="subtitle">Consulta de participación DETALLADO </p>
										<div id="page-wrap">
											<table class="table21">
												<tbody>
				                                    <tr class="titulo_tabla">
				                                        <td><%= session.getAttribute("DPD") %></td>
				                                        <td>TOTAL ASISTENTES</td>
				                                        <td>% TOTAL ASISTENTES</td>
				                                        <td>TOTAL AUSENTES</td>
				                                        <td>% TOTAL AUSENTES</td>
				                                        <td>ELECTORES HÁBILES</td>
				                                    </tr>
				                                
				                                	<% for ( String[] aData : data ) { %>    
					                                    <tr>
					                                        <td><%= aData[1] %></td>
					                                        <td><%= aData[2] %></td>
					                                        <td><%= aData[3] %></td>
					                                        <td><%= aData[4] %></td>
					                                        <td><%= aData[5] %></td>
					                                        <td><%= aData[6] %></td>
					                                    </tr>
				                                    <% } %>
				                                    <tr>
				                                        <td>TOTALES</td>	
				                                        <td>17,953,367</td> 
				                                        <td>81.543%</td>
				                                        <td>4,063,663</td>
				                                        <td>18.457%</td>
				                                        <td>22,017,030</td>
				                                    </tr>
												</tbody>
											</table>
										</div>
									</div>
								<% } %>
													
							</div>
						</div>
				
					</div>
				</section>
			</div>
		</div>
		<div id="divDetalle"></div>
		
		<%@include file="WEB-INF/footer.jsp" %>
	</body>
</html>