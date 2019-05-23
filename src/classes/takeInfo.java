
package classes;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class takeInfo extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out=response.getWriter();
        out.println("<h1>The text you entered is: "+request.getParameter("txt")+"</h1>");
        
    }
}
