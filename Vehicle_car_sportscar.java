package Multilevel_Inheritance_Question;
public class Vehicle{
    String fueltype; 
    public Vehicle(String fueltype) {
		this.fueltype = fueltype;
    }
	
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public class car{
		int seats;

		public car() {
			super(fueltype);
			// TODO Auto-generated constructor stub
		}

		public String getSeats() {
			return seats;
		}

		public void setSeats(String seats) {
			this.seats = seats;
		}
		public class SporsCar{
			int topseep;

			public SporsCar(int topseep) {
				super(fueltype,seats);
				this.topseep = topseep;
			}

			public int getTopseep() {
				return topseep;
			}

			public void setTopseep(int topseep) {
				this.topseep = topseep;
			}
			// Main class
			public class Main {
			    public static void main(String[] args) {
			        Manager s1 = new Manager("tpp", 5, "Java");
			        s1.display();
			        s1.setName("Satyam Kumar");
			        s1.setSalary(12000);
			        s1.setDepartment("Python");
			        System.out.println("\nAfter updates:");
			        s1.display();
			    }
			}
		}
	}
}
