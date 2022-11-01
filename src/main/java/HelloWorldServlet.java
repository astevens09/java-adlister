import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TestServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        res.setContentType("text/html");
        String name = req.getParameter("name");

        try {
            if(name == null){
                res.getWriter().println("<h1> Hello World</h1>");
            }else{
                res.getWriter().println("<h1>"+name+" Hello World</h1>");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
