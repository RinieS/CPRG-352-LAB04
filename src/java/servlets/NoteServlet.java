/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 840979
 */
public class NoteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      String title="";
      String contents="";
      
      BufferedReader br = new BufferedReader(new FileReader(new File(path)));
      for (int i = 0; i <= 1; i++){
          if (i == 1){
              title = br.readLine();
          }
          if (i == 0){
              contents = br.readLine();
          }
           }
      Note mynote = new Note(title,contents);
      request.setAttribute("mynote", mynote);
          
        
        String edit = request.getParameter("edit");
        if (edit != null && edit.equals("true")) {
           
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
        }
  
        else  {getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    
    }
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    String path = getServletContext().getRealPath("/WEB-INF/note.txt");
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
     
}
    }
       
      
        
    

   


