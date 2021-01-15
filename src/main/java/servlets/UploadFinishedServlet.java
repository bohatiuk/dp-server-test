package servlets;

import core.VideoDecoder;
import core.VideoManager;
import io.github.techgnious.exception.VideoException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

@WebServlet(name = "UploadFinishedServlet")
public class UploadFinishedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String filename = (String) request.getParameter("filename");
        String username = filename.substring(0, filename.indexOf("_"));
        String videoname = filename.substring(0, filename.indexOf("."));


        try {
            VideoDecoder.toHls(VideoDecoder.compress(username, videoname));

        }
        catch (VideoException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}