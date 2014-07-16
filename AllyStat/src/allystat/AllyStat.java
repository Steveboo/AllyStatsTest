/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allystat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Steveboo
 */
public class AllyStat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x;
       int y;
        try {
		BufferedReader in = new BufferedReader(new FileReader("Allystats.txt"));
		String zeile = null;
		while ((zeile = in.readLine()) != null) {
		                if(zeile.startsWith("Name")){}
                                else{
                                    if(zeile.startsWith("Ste")){
                                    //x=zeile.codePointAt(8);
                                   // x=zeile.indexOf(9);
                                  //  zeile.
                                   // zeile.la
                                        zeile=zeile.replaceAll(" ",".");
                                        x=zeile.indexOf(".");
                                        y=zeile.indexOf(".", x+1);
                                        zeile=zeile.replaceAll(zeile.substring(x, y),"");
                                        x=zeile.indexOf("[");
                                        y=zeile.indexOf("]");
                                       zeile=zeile.replaceAll(zeile.substring(x, y),"");
                System.out.println( zeile);
                } 
                                }
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
        
    }
    
}
