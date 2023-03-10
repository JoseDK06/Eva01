<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<% String [] aCine = (String []) session.getAttribute("aCine");%>
		
		<h2><%= aCine[1] %></h2>
				<div class="cine-info">
					<div class="cine-info datos">
						<p><%= aCine[4] %> - <%= aCine[6] %></p>
						<p>Tel?fono: <%= aCine[5] %></p>
						<br/>
						<div class="tabla">
						<% String [][] mTarifas = (String [][]) session.getAttribute("mTarifas");
							boolean bolFila=true;
							for (String [] aTarifa:mTarifas) { %>
							<div class=<%= bolFila ? "fila" : "fila impar" %>>
								<div class="celda-titulo"><%= aTarifa[0] %></div>
								<div class="celda"><%= aTarifa[1] %></div>
							</div>
						 <% bolFila= !bolFila; } %>
						</div>
						<div class="aviso">
							<p>A partir del 1ro de julio de 2016, Cinestar Multicines realizar? el cobro de la comisi?n de S/. 1.00 adicional al tarifario vigente, a los usuarios que compren sus entradas por el aplicativo de Cine Papaya para Cine Star Comas, Excelsior, Las Am?ricas, Benavides, Bre?a, San Juan, UNI, Aviaci?n, Sur, Porte?o, Tumbes y Tacna.</p>
						</div>
					</div>
					<img src="img/cine/1.2.jpg"/>
					<br/><br/><h4>Los horarios de cada funci?n est?n sujetos a cambios sin previo aviso.</h4><br/>
					
					<div class="cine-info peliculas">
						<div class="tabla">
							<div class="fila">
								<div class="celda-cabecera">Pel?culas</div>
								<div class="celda-cabecera">Horarios</div>
							</div>
							<% String [][] mPeliculas = (String [][]) session.getAttribute("mPeliculas");
								bolFila=false;
								for (String [] aPelicula:mPeliculas) { %>
							<div class=<%= bolFila ? "fila" : "fila impar" %>>
								<div class="celda-titulo"><%= aPelicula[0] %></div>
								<div class="celda"><%= aPelicula[1] %></div>
							</div>
							<% bolFila= !bolFila; } %>
						</div>
					</div>
					
				</div>
				<div>
					<img style="float:left;" src="img/cine/<%= aCine[0] %>.3.jpg"/>
					<span class="tx_gris">Precios de los juegos: desde S/1.00 en todos los Cine Star.<br/>
						Horario de atenci?n de juegos es de 12:00 m hasta las 10:30 pm. 
						<br/><br/>
						Visit?nos y divi?rtete con nosotros. 
						<br/><br/>
						<b>CINESTAR</b>, siempre pensando en t?. 
					</span>
				</div>	
	</body>
</html>