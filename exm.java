package input;
import java.io.*;
import java.util.*;

public class exm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String id;
		String pass;
		System.out.println("id입력");
		id=input.next();
		System.out.println("비밀번호");
		pass=input.next();	

		
		Writer out=new FileWriter("log.txt");
		out.write(id);
		out.write(pass);
		out.close();
		
	}

}
