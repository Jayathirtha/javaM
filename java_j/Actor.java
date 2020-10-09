package java_mph;

public class Actor {
	private String name;
	private String role;
	public Actor() {
		
	}
	
	public Actor(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void printActors() {
		System.out.println("Actor Name = "+ name);
		System.out.println("Actor Role = "+ role);
	}
}