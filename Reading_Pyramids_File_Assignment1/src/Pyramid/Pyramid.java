/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramid;

/**
 *
 * @author LENOVO
 */
public class Pyramid 
{
    String pharoah,modern_name,site;
    double height;
    
    public Pyramid(String pharoah,String modern_name,String site,double height)
    {
        this.pharoah=pharoah;
        this.modern_name=modern_name;
        this.site=site;
        this.height=height;
    }

    public void setPharoah(String pharoah) {
        this.pharoah = pharoah;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPharoah() {
        return pharoah;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String toString() 
    {
       return "Pharoah of Pyramid is : "+pharoah+
               ", Pyramid's modern name is : "+modern_name+
               ", Site is : "+site+", Height is : "+height;
    }
}
