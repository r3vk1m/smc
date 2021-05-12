
public class TriangleExam {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.2, 17.3);
		System.out.println("삼각형1 : " + t1.get());
		t1.set(7.5, 9.2);
		System.out.println("삼각형2 : " + t1.get());
		
	}

}
class Triangle{
	double g,s;
	public Triangle(double g, double s){
		this.g = g;
		this.s = s;
	}
	public void set(double g, double s){
		this.g = g;
		this.s = s;
	}
	public double get(){
		return (g*s*0.5);
	}
}