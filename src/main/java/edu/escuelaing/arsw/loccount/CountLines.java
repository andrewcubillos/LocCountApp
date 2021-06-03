package edu.escuelaing.arsw.loccount;
import java.io; 
import java.util;
/**
 * Hello world!
 *
 */
public class CountLines
{
    public static void main( String[] args )
    {
        int count = 0;
		String typeOfCount = args[0]; 
		String fileName = args[1];
		FileReader file = new FileReader(fileName);
		BufferReader  buffer = new BufferReader(file);
		while ((linea = buffer.readLine())!=null){
			count++;
		}
		
		System.out.println(count);
		
    }
}
