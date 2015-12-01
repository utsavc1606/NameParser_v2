# Name Parser: User Instructions

Input: Any .csv (PIPE delimited) or .txt file that contains NO headers. The first column is expected to be Full Name because that is the only column this utility works on. <br /><br />

Output: Pipe delimited csv. or .txt file with first three columns as FirstName, MiddleName and LastName. remaining columns remain identical to input file. <br />

Usage: <br />
1. Download NameParser_v3-1.jar from "NameParser_v2/NameParser/jars/" in the repository, or click <a href = "https://github.com/utsavc1606/NameParser_v2/tree/master/NameParser/jars">HERE</a> to download the jar. <br />
2. Open terminal or command prompt and invoke the tool as shown below: <br />
java -jar NameParser_v3-1.jar "input file name with path.csv" "output file name with path.csv" <br />
3. The output file should open in MS Excel, but just in case all fields show up in the same column, <br />
- Select the entire column.<br />
- Go to Data tab > Text to Columns.<br />
- Select Delimited > Next > select Other and type in the pipe character "|".<br />
- Hit Next and Finish.

	
	
	
