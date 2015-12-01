# NameParser
Input: Any .csv (PIPE delimited) or .txt file that contains NO headers. The first column is expected to be Full Name because that is the only column this utility works on. 
Output: Pipe delimited csv. or .txt file with first three columns as FirstName, MiddleName and LastName. remaining columns remain identical to input file. 
Usage: 
1. Download NameParser_v3.jar from "NameParser_v2/NameParser/jars/" in the repository (https://github.com/utsavc1606/NameParser_v2).
2. Open terminal or command prompt and invoke the tool as shown:
	java -jar NameParser_v3.jar <input file name with path.csv> <output file name with path.csv>
	
	
