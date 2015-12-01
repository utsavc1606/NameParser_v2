package ade;

import java.io.*;

public class Parse {

	public static void main(String[] args) {
		
		// The name of the file to open.
        String fileName = args[0]; //pass output file name as second parameter
        PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream(args[1])); //pass output file name as second parameter
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.setOut(out);

        // Initializing the variables
        String line = null;
        String fn = null;
        String mn = null;
        String ln = null;
        
        System.out.println("FirstName|MiddleName|LastName");  //printing out column headers in output

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	line.replaceAll("^\\s+", "");
                String[] elements = line.split(" ");
                if (elements.length == 1) {
					fn = elements[0];
					System.out.println(fn+"||");
					
				}
                else if (elements.length == 2) {
					fn = elements[0];
					ln = elements[1];
					System.out.println(fn+"||"+ln);
					
				} else if (elements.length == 3){
					fn = elements[0];
					mn = elements[1];
					ln = elements[2];
					System.out.println(fn+"|"+mn+"|"+ln);
				}
				else{
					fn = elements[0];
					mn = elements[1];
					ln = elements[2] + elements[3];
					System.out.println(fn+"|"+mn+"|"+ln);
				}
            }   

            //close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            
        }

	}

}
