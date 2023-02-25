<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
	<% String [] aPelicula = (String []) session.getAttribute("data");%>
		<br/><h1>Cartelera</h1><br/>
				<div class="contenido-pelicula">
					<div class="datos-pelicula">
						<h2><%= aPelicula[1] %></h2>
						<p><%= aPelicula[10] %></p>
						<br/>
						<div class="tabla">
							<div class="fila">
								<div class="celda-titulo">Título Original :</div>
								<div class="celda"><%= aPelicula[1] %></div>
							</div>
							<div class="fila">
								<div class="celda-titulo">Estreno :</div>
								<div class="celda"><%= aPelicula[2] %></div>
							</div>
							<div class="fila">
								<div class="celda-titulo">Género :</div>
								<div class="celda"><%= aPelicula[4] %></div>
							</div>
							<div class="fila">
								<div class="celda-titulo">Director :</div>
								<div class="celda"><%= aPelicula[3] %></div>
							</div>
							<div class="fila">
								<div class="celda-titulo">Reparto :</div>
								<div class="celda"><%= aPelicula[9] %></div>
							</div>
						</div>
					</div>
					<img src="img/pelicula/<%= aPelicula[0] %>.jpg" width="160" height="226"><br/><br/>
				</div>
				<div class="pelicula-video">
					<embed src="http://www.youtube.com/v/<%= aPelicula[8] %>" type="application/x-shockwave-flash" ="always" allowfullscreen="true" width="580" height="400">
				</div>
	</body>
</html>