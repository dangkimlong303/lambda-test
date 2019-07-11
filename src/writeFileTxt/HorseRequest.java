package writeFileTxt;

public class HorseRequest {

	private String name;
	private String date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public HorseRequest() {
	}

	public HorseRequest(String name, String date) {
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "HorseRequest{" +
				"name='" + name + '\'' +
				", date='" + date + '\'' +
				'}' + "\n";
	}
}
