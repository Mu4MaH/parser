import javax.servlet.http.*;
import java.io.IOException;

public class parser extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print("<H1>I shall parse all night long</H1>");
    }
}