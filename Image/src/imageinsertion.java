import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.stream.FileImageInputStream;

public class imageinsertion {
	
	
	
	static public void main(String args[])
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			imageinsertion in =new imageinsertion(); 
			Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/image", "Chosen1", "demo");
			
			PreparedStatement ps=cn.prepareStatement("insert into imh (img)values (?)",PreparedStatement.RETURN_GENERATED_KEYS);
			

			
			File f= new File("1.png");

			FileInputStream fs= new FileInputStream(f);
			
			ps.setBinaryStream(1,fs);
			ps.executeUpdate();
			
		
		
	}
catch(Exception e) {
	
	
	e.printStackTrace();
}}
}
