import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", value = "/TranslationServlet")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String > map= new HashMap<>();
        map.put("helle","xin chào");
        map.put("cat","mèo");
        map.put("book","quyển vở");
        map.put("computer", "máy tính");

        String search= request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result= map.get(search);
        if (result!= null){
                writer.println("WORD: "+search);
            writer.println("RESULT: "+ result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
}
