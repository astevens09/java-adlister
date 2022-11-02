import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

@WebServlet(name = "PizzaRoute", urlPatterns = "/pizza-order")
public class pizzaRoute extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//       Path pizzaFormPath = Paths.get("../webapp/pizzaForm.jsp");
//        res.getWriter().println(pizzaFormPath.toString());
        req.getRequestDispatcher("/pizzaForm.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String address = request.getParameter("address");
        String [] toppings = new String[4];

        toppings[0]= request.getParameter("topping1");
        toppings[1] = request.getParameter("topping2");
        toppings[2] = request.getParameter("topping3");
        toppings[3] = request.getParameter("topping4");

        System.out.printf("Crust type: %s\n",crust);
        System.out.printf("Sauce type: %s\n",sauce);
        System.out.printf("Size: %s\n",size);
        System.out.printf("Address : %s\n",address);
        Arrays.stream(toppings).sequential()
                .filter(e -> e!=null)
                .forEach(e-> System.out.printf("Toppings: %s\n",e));

        response.sendRedirect("pizzaForm.jsp");

    }

}
