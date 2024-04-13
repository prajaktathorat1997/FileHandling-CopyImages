package com.readbyte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public ImageCopy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\pratik.jpg");
			File f=new File("D:\\MyImages");
			f.mkdir();
			File ff=new File(f,"prajakta.jpg");
			
				ff.createNewFile();
				FileOutputStream p=new FileOutputStream(ff);
			
				byte[]a=fis.readAllBytes();
				
			p.write(a);
			System.out.println();
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
