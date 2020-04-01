package bonus01;

public class Vorlesung {
	String name, dozent, studiengang;
	
	//constructor
	public Vorlesung(String name, String dozent, String studiengang) {
		this.name=name;
		this.dozent=dozent;
		this.studiengang=studiengang;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getDozent() {
		return dozent;
	}
	public String getStudiengang() {
		return studiengang;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setDozent(String dozent) {
		this.dozent=dozent;
	}
	public void setStudiengang(String studiengang) {
		this.studiengang=studiengang;
	}
}
