
public class Computer {
	private String brand;
	private int hardDriveSpace;
	private int year;
	
	public Computer(String brand, int hardDriveSpace, int year) {
		this.brand = brand;
		this.hardDriveSpace = hardDriveSpace;
		this.year = year;
	}
	
	public Computer() {
		this("Default", 0, 0);
	}
	
	public int compareTo(Computer c) {
		if(!this.brand.equals(c.brand)) {
			return this.brand.compareTo(c.brand);
		} else if(this.hardDriveSpace != c.hardDriveSpace) {
			return this.hardDriveSpace - c.hardDriveSpace;
		} else if(this.year != c.year) {
			return this.year - c.year;
		} else {
			return 0;
		}
	}
}
