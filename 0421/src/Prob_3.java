import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Grade G = new Grade();
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
				
		G.math = scan.nextInt();
		G.science = scan.nextInt();
		G.english = scan.nextInt();
		
		System.out.println("평균은 " + G.average());
		
		scan.close();
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
		
	}
}