package web;

import java.io.IOException;

import com.sun.net.httpserver.HttpServer;

/**
 * Servlet implementation class ControlleurServlet
 */
@WebServlet("/ControlleurServlet")
public class ControlleurServlet extends HttpServer {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControlleurServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param <HttpServletRequest>
	 * @param <HttpServletResponse>
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected <HttpServletRequest, HttpServletResponse> void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param <HttpServletRequest>
	 * @param <HttpServletResponse>
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected <HttpServletRequest, HttpServletResponse> void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
