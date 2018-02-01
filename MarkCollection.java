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
public class MarkCollection 
{
    private int size;
    
    public void setSize()
    {
        int markRecordNumber;
        try
        {
            BufferedReader cons=new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter the size of the mark record group:");
            markRecordNumber = Integer.parseInt(cons.readLine());
            
            for(int i = 0; i<=markRecordNumber;)
            {
                MarkRecord k = new MarkRecord();
            }
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
