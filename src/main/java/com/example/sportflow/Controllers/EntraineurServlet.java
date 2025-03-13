package com.example.sportflow.Controllers;

import com.example.sportflow.Dao.EntraineurDAO;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class EntraineurServlet extends HttpServlet {

    private EntraineurDAO entraineurDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        entraineurDAO = new EntraineurDAO();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String action = req.getParameter("action");

        if (action == null){
            req.getRequestDispatcher("offre/listEntraineurs.jsp").forward(req,resp);
        }


        switch (action){
            case "create":
                createEntraineur(req,resp);
                break;
            case "afficher":
                listeEntraineur(req,resp);
                break;
            case "modifier":
                modifierEntraineur(req,resp);
                break;
            case "supprimer":
                supprimerEntraineur(req,resp);
                break;
            default:
                req.getRequestDispatcher("listEntraineur.jsp");

        }


    }

    private void supprimerEntraineur(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void modifierEntraineur(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void listeEntraineur(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void createEntraineur(HttpServletRequest req, HttpServletResponse resp) {

    }
}
