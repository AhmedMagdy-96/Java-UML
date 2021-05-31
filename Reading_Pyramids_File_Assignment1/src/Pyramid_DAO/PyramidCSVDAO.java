/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramid_DAO;

import Pyramid.Pyramid;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LENOVO
 */
public class PyramidCSVDAO implements PyramidDao_Interface 
{

    @Override
    public List<Pyramid> Get_Data(String file_path) 
    {
        List<Pyramid> Data=new ArrayList();
        
        try 
        {
            File fileObj=new File(file_path);
            Scanner scan=new Scanner(fileObj);
            scan.nextLine();
            while(scan.hasNextLine())
            {
                String line =scan.nextLine();
                String[] splits=line.split(",");
                Pyramid NewPyr=new Pyramid(splits[0],splits[1],splits[2],Double.valueOf(splits[3]));
                Data.add(NewPyr);
            }
            
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Data;
    }
    
}
