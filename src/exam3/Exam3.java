package exam3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class Exam3 {

	public static void main(String[] args) {
new ReadByGet().start();
	
		
	
}
}



class ReadByGet extends Thread{
	 @Override
	public void run() {
//		 TransformerFactory transF = TransformerFactory.newInstance(); 
		 
	try {
		
		
		URL url=new URL("http://hq.sinajs.cn/list=sh601006");
		URLConnection uc= url.openConnection();
		 InputStream is= uc.getInputStream();
		 InputStreamReader isr=new InputStreamReader(is);
		 BufferedReader br=new BufferedReader(isr);
		 String line;
		 StringBuilder sb=new StringBuilder();
		
		 while((line=br.readLine())!=null){
			 sb.append(line);
			 TransformerFactory tf=TransformerFactory.newInstance();
			 Transformer t = tf.newTransformer();
			
		 }
		br.close();
		isr.close();
		is.close();
		System.out.println(sb.toString());
		
		
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (TransformerConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}


