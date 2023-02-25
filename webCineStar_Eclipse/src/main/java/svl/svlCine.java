package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class svlCine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlCine() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    			response.getWriter().append("Served at: ").append(request.getContextPath());
    			response.setCharacterEncoding("UTF-8");
    			HttpSession session = request.getSession();
    			dao.CineDAO daoCine = new  dao.CineDAO();
    			
    			
    			Object idCine = request.getParameter("idCine");
    			if(idCine ==null) {
    				String[][] mCines = daoCine.getCines();
    				
    				session.setAttribute("id", mCines == null ? null : "4");
    				session.setAttribute("mCines", mCines);
    			} else {
    				String [] aCine = daoCine.getCine(idCine);
    				
    				session.setAttribute("id", aCine == null ? null : "5");
    				session.setAttribute("aCine", aCine);
    				session.setAttribute("mTarifas", daoCine.getCineTarifas(idCine));
    				session.setAttribute("mPeliculas", daoCine.getCinePeliculas(idCine));
    			}
    			response.sendRedirect("index.jsp");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
