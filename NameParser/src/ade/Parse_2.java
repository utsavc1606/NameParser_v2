package ade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Parse_2 {

	public static void main(String[] args) {
		//pass input file name as second parameter
		String fileName = args[0]; 
        PrintStream out = null; 
		try {
			//pass output file name as second parameter
			out = new PrintStream(new FileOutputStream(args[1])); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        System.setOut(out);

        // Initializing the variables
        String line = null;
        String fullName = null;
        String remData = "";
        String fn = null;
        String mn = null;
        String ln = null;
        int numCol = 0;
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            //reading line by line
            while((line = bufferedReader.readLine()) != null) {
            	//removing unnecessary leading white-spaces
            	line.replaceAll("^\\s+", ""); 
            	
            	//splitting by pipe to separate columns
                String[] elements = line.split("\\|"); 
                
                //find number of columns
                numCol = elements.length; 
                
                //full name will be the first column
                fullName = elements[0];
                fullName = fullName.replaceAll("  ", " ");
                fullName = fullName.replaceAll("   ", "");
                fullName = fullName.replaceAll("    ", "");
                
                //building string for non-name data
                for (int i = 1; i < numCol; i++) {
					remData = remData +"|"+ elements[i];
				}
                
                //Splitting the full name now into parts
                String[] nameElements = fullName.split(" ");
                
                if (nameElements.length == 1) {
					fn = nameElements[0];
					System.out.println(fn + "||" + remData);
				}
                else if (nameElements.length == 2){
                	fn = nameElements[0];
                	ln = nameElements[1];
                	System.out.println(fn + "||"+ ln + remData);
                }
                else if (nameElements.length == 3){
                	fn = nameElements[0];
                	mn = nameElements[1];
                	ln = nameElements[2];
                	System.out.println(fn + "|" + mn + "|" + ln  + remData);
                }
                else if (nameElements.length == 4){
                	fn = nameElements[0];
                	mn = nameElements[1];
                	ln = nameElements[2] + nameElements[3];
                	System.out.println(fn + "|" + mn + "|" + ln + remData);
                }
                
                remData = "";
                
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

