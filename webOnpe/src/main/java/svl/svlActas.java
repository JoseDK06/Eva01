package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class svlActas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public svlActas() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		dao.OnpeDAO daoOnpe = new dao.OnpeDAO();
		String nroMesa = request.getParameter("nroMesa");
		Object data = null;
		
		if( nroMesa != null){
			data = daoOnpe.getGrupoVotacion( nroMesa);
		}
		session.setAttribute("nroMesa", nroMesa);
		session.setAttribute("data", data);
		
		response.sendRedirect("actas.jsp");
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


}
