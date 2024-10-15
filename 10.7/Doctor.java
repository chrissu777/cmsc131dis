
public class Doctor {
	private String name;
	private String specialty;
	private int yearsOfExperience;
	private StringBuffer patientsSeen;

	public Doctor(String name, String specialty, int yearsOfExperience) {
		this.name = name;
		this.specialty = specialty;
		this.yearsOfExperience = yearsOfExperience;
		this.patientsSeen = new StringBuffer();
	}

	public Doctor() {
		this("NONAME", "GENERAL", 0);
	}

	public Doctor(String name, String specialty) {
		this(name, specialty, 0);
	}

	public String toString() {
		return "Name: " + name + ", Specialty: " + specialty + ", Experience: " + yearsOfExperience + ", Patients: "
				+ patientsSeen;
	}

	public boolean increaseExperience(int exp) {
		if (exp < 0) {
			return false;
		}
		if (!validExperience(exp + yearsOfExperience)) {
			return false;
		}
		yearsOfExperience += exp;
		return true;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void seePatient(String patient) {
		if (name != null) {
			patientsSeen.append(patient);
		}
	}

	private boolean validExperience(int exp) {
		if (exp >= 0 && exp <= 75) {
			return true;
		} else {
			return false;
		}
	}

}
