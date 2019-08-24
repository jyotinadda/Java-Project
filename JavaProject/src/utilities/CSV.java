package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class CSV {
	
	//This function will read data from a csv file and return as a list
	public static List<String[]> read(String file)
	{
		List<String[]> data=new LinkedList<>();
		String dataRow;
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			while((dataRow=br.readLine())!=null)
			{
				String[] datarecords=dataRow.split(",");
				data.add(datarecords);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
