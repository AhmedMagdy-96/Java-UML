/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reading_pyramids_file_assignment1;

import Pyramid.Pyramid;
import Pyramid_DAO.PyramidCSVDAO;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Reading_Pyramids_File_Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PyramidCSVDAO Pyr=new PyramidCSVDAO();
        List<Pyramid> data=Pyr.Get_Data("D:/Career/ITI/the 9 month/Java and UML/Session 2/pyramids.csv");
        for (int i =0;i<data.size();i++)
        {
            System.out.println(data.get(i));
        }          
    }
    
}
