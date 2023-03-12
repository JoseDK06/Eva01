package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class svlParticipacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public svlParticipacion() {
        super();
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		dao.OnpeDAO daoOnpe = new dao.OnpeDAO();
		
		String id = request.getParameter("id");
		String sDPD = null, sAmbito=null;
		Object data = null;
		
		if ( id != null ) {
			String aID[] = id.split(",");
			int tID = aID.length;
			boolean bNacional = aID[0].equals("Nacional");
			
			if(tID == 1) sDPD = bNacional ? "DEPARTAMENTO" : "CONTINENTE";
			else if(tID == 2) sDPD = bNacional ? "PROVINCIA" : "PAIS";
			else if(tID == 3) sDPD = bNacional ? "DISTRITO" : "CIUDAD";
			
			if(tID == 1) data = daoOnpe.getVotos( bNacional ? 1 : 26, bNacional ? 25 : 30 );
			else if(tID == 2) data = daoOnpe.getVotosDepartamento( aID[1] );
			else if(tID == 3) data = daoOnpe.getVotosProvincia( aID[2] );
			
			sAmbito = "Ámbito: " + aID[0];
			if (tID > 1 ) sAmbito += "<br/>" + (bNacional ? "Departamento" : "Continente" ) + " : " + aID[1];
			if (tID > 2 ) sAmbito += "<br/>" + (bNacional ? "Provincia" : "Pais" ) + " : " + aID[2];
			if (tID > 3 ) sAmbito += "<br/>" + (bNacional ? "Distrito" : "Ciudad" ) + " : " + aID[3];
		}
		
		session.setAttribute("id", id);
		session.setAttribute("DPD", sDPD);
		session.setAttribute("ambito", sAmbito);
		session.setAttribute("data", data);
		
		response.sendRedirect("participacion.jsp");
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


}
