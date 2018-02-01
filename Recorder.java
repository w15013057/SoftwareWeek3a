/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.io.*;

/**
 *
 * @author w15013057
 */
public class Recorder 
{
    public Recorder()
    {
        
    }
    
    public void CreateClass()
    {
        int numStudents;
        try
        {
            BufferedReader cons=new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter the size of the student group:");
            numStudents = Integer.parseInt(cons.readLine());
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        
        MarkCollection x = new MarkCollection();
        x.setSize();
    }      
}


