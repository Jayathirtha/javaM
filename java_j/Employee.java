package java_mph;

public class Employee {
								
				public int id;
				public String name;
				public double salary;
				
				
				Address Ad;
				
				

				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
				}

				public String getName() {
					return name;
				}

				public Employee(int id, String name, double salary) {
					
					this.id = id;
					this.name = name;
					this.salary = salary;
				}

				public Address getAd() {
					return Ad;
				}

				public void setAd(Address ad) {
					Ad = ad;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Employee() {
					super();
				}

				public double getSalary() {
					return salary;
				}

				public void setSalary(double salary) {
					this.salary = salary;
				}
				
				
				

				void empInfo() {
					System.out.println("Id =" + id);
					System.out.println("Name = " + name);
					System.out.println("Salary =" + salary);
					Ad.printAddress();
			}							
}
