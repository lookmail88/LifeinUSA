/**
* <p>Title: HttpReader.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
* <p>Title: HttpReader</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
*/
public class HttpReader {
	public static String Httpreader(String url){
		String r="";
		String sText = ""; 
        URLConnection urlcon = null; 
        try { 
            URL XmlUrl = new URL(url); 
            urlcon = XmlUrl.openConnection(); 
            InputStream in = urlcon.getInputStream(); 
            String line = ""; 
            InputStreamReader fileIn = new InputStreamReader(in); 
            BufferedReader reader = new BufferedReader(fileIn); 
            while ((line = reader.readLine()) != null) { 
                sText += line; 
            } 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
		return sText;
	}
}
