package writeFileTxt;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
	public static void main(String[] args) {
		List<HorseRequest> horseRequests = new ArrayList<>();
		horseRequests.add(new HorseRequest("m","1"));
		horseRequests.add(new HorseRequest("n","2"));
		horseRequests.add(new HorseRequest("b","3"));
		horseRequests.add(new HorseRequest("v","4"));

		String filename = "test.txt";
		try {
			PrintWriter printWriter = new PrintWriter(filename);
			horseRequests.forEach(horseRequest -> {
				printWriter.write(horseRequest.toString());
			});
			printWriter.close();
			System.out.println("done!");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
