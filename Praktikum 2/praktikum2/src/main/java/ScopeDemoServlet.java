
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldi Reza Sastrawan
 */
@WebServlet("/scopedemo")
public class ScopeDemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        String nama = req.getParameter("nama");
        String email= req.getParameter("email");
        String tgl= req.getParameter("tgl");
        String alamat= req.getParameter("alamat");
        
        res.setContentType("text/html");
        PrintWriter output = res.getWriter();
        
        output.println("<html>");
        output.println("<head><title>Demo Scope HTTP</title></head>");
        output.println("<body>");
        output.println("<h1>Input Data Mahasiswa</h1>");
        output.println("<h2>Nama :"+nama+"</h2>");
        output.println("<h2>Email :"+email+"</h2>");
        output.println("<h2>Tanggal Lahir :"+tgl+"</h2>");
        output.println("<h2>Alamat :"+alamat+"</h2>");
        output.println("<a href=\"/scopedemo\">Reload</a>");
        
        output.println("</body>");
        output.println("</html>");
    }
    
}
