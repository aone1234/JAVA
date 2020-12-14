package kr.co.kihd.inetaddress;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
	
	public static void main(String[] args) throws Exception {
		
		String str = "https://lh5.googleusercontent.com/p/AF1QipMGUsroCou49CjvAhNInHfC4EgkYIBM4WFWEWHi=w408-h544-k-no";
		
		URL url = new URL(str);
		
		URLConnection conn = url.openConnection();
		System.out.println("toString() : " + conn);
		int size = conn.getContentLength();
		System.out.println("파일 크기 : " + size);
		System.out.println("파일 타입 : " + conn.getContentType());
		System.out.println();
		
		InputStream in = url.openStream();
		BufferedInputStream bi = new BufferedInputStream(in);
		
		FileOutputStream fo = new FileOutputStream("gumi.jpg");
		
		byte[] buffer = new byte[1024];
		int imgData = 0;
		int cnt = 0;
		
		while((imgData = bi.read(buffer)) != -1) {
			fo.write(buffer, 0, imgData);
			fo.flush();
			cnt += imgData;
			System.out.println(((cnt*100)/size) + "%");
		}
		
		in.close(); 
		bi.close(); 
		fo.close();
		
	}

}









































