
public class Discountsale {
	
	public void result(String name, int science, int math, int english) {
		int marks= science+math+english;
		System.out.println("Student: " + name);
		
		if(marks >=240) {
			System.out.println("Grade A");
		}
		else if (marks >= 180 && marks<240) {
			System.out.println("Grade B");
		}
		else if (marks >= 120 && marks<180) {
			System.out.println("Grade C");
		}
			else if (marks >= 60 && marks<120) {
				System.out.println("Grade D");
			}
			else {
				System.out.println("Failed");
			}
		System.out.println();
	}

		public static void main(String[] args) {
				
		Discountsale a=new Discountsale();
				
		a.result("Ammini", 89, 70, 78);
		a.result("Raj", 92, 93, 94);
		a.result("Raj", 65, 45, 55);
		
		}
}

