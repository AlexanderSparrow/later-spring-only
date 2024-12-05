package ru.practicum;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req,
                          HttpServletResponse resp) throws IOException {
        resp.getWriter().print("OK!");
    }
}
