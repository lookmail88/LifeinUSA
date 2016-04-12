/**
* <p>Title: HashGeneraterUtil.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 19, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
* <p>Title: HashGeneraterUtil</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 19, 2015
*/
public class HashGeneratorUtils {
    private HashGeneratorUtils() {
 
    }
 
    public static String generateMD5(String message)  {
        return hashString(message, "MD5");
    }
 
    public static String generateSHA1(String message) {
        return hashString(message, "SHA-1");
    }
 
    public static String generateSHA256(String message)  {
        return hashString(message, "SHA-256");
    }
 
    private static String hashString(String message, String algorithm)
            {
 
        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hashedBytes = digest.digest(message.getBytes("UTF-8"));
 
            return convertByteArrayToHexString(hashedBytes);
        } catch (Exception ex) {
            ex.printStackTrace();
                 //   "Could not generate hash from String"
        }
        
        return "Could not generate hash from String";
    }
 
    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
}