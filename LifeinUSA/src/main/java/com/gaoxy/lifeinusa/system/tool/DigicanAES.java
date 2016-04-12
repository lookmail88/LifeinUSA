/**
* <p>Title: DigicanAES.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 31, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
* <p>Title: DigicanAES</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 31, 2015
*/
public class DigicanAES {  
    
    public static void main(String[] args) throws Exception {  
        //加密  
        /*byte[] text = "hello world".getBytes(); 
        byte[] b = getAESEncode("d:\\testAES",text); 
        FileOutputStream fos = new FileOutputStream("d:\\testAESjiamji"); 
        fos.write(b); 
        fos.flush(); 
        fos.close();*/  
          
        //解密  
        /*File file = new File("d:\\testAESjiamji"); 
        byte[] bm = new byte[(int) file.length()]; 
        FileInputStream fis = new FileInputStream(file); 
        fis.read(bm); 
        byte[] b = getAESDecode("d:\\testAES", bm); 
        System.out.println(new String(b));*/  
    }  
  
    /** 
     * 生成密钥 
     * 自动生成AES128位密钥 
     * @throws NoSuchAlgorithmException  
     * @throws IOException  
     */  
    public static String getAutoCreateAESKey() {  
       String re="Generate key error";
		try {
			 KeyGenerator kg = KeyGenerator.getInstance("AES");
			kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256  
	        SecretKey sk = kg.generateKey();  
			re=new String(sk.getEncoded());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
           
        return re;
    } 
    /** 
     * 生成密钥 
     * 自动生成AES128位密钥 
     * 传入保存密钥文件路径 
     * filePath 表示文件存储路径加文件名；例如d:\aes.txt 
     * @throws NoSuchAlgorithmException  
     * @throws IOException  
     */  
    public static void getAutoCreateAESKey(String filePath) throws NoSuchAlgorithmException, IOException{  
        KeyGenerator kg = KeyGenerator.getInstance("AES");  
        kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256  
        SecretKey sk = kg.generateKey();  
        byte[] b = sk.getEncoded();  
        FileOutputStream fos = new FileOutputStream(filePath);  
        fos.write(b);  
        fos.flush();  
        fos.close();  
    } 
    
      
    /** 
     * 加密 
     * 使用对称密钥进行加密 
     * keyFilePath 密钥存放路径 
     * text 要加密的字节数组 
     * 加密后返回一个字节数组 
     * @throws IOException  
     * @throws NoSuchPaddingException  
     * @throws NoSuchAlgorithmException  
     * @throws InvalidKeyException  
     * @throws BadPaddingException  
     * @throws IllegalBlockSizeException  
     */  
    public static byte[] getAESEncode(String keyFilePath,byte[] text) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{  
        File file = new File(keyFilePath);  
        byte[] key = new byte[(int) file.length()];  
        FileInputStream fis = new FileInputStream(file);  
        fis.read(key);  
        SecretKeySpec sKeySpec = new SecretKeySpec(key, "AES");  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.ENCRYPT_MODE, sKeySpec);  
        byte[] bjiamihou = cipher.doFinal(text);  
        return bjiamihou;  
    }  
      
    /** 
     * 解密 
     * 使用对称密钥进行解密 
     * keyFilePath 密钥存放路径 
     * text 要解密的字节数组 
     * 解密后返回一个字节数组 
     * @throws IOException  
     * @throws NoSuchPaddingException  
     * @throws NoSuchAlgorithmException  
     * @throws InvalidKeyException  
     * @throws BadPaddingException  
     * @throws IllegalBlockSizeException  
     */  
    public static byte[] getAESDecode(String keyFilePath,byte[] text) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{  
        File file = new File(keyFilePath);  
        byte[] key = new byte[(int) file.length()];  
        FileInputStream fis = new FileInputStream(file);  
        fis.read(key);  
        SecretKeySpec sKeySpec = new SecretKeySpec(key, "AES");  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.DECRYPT_MODE, sKeySpec);  
        byte[] bjiemihou = cipher.doFinal(text);  
        return bjiemihou;  
    }  
}  