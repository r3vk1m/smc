import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");
		int check=0;										//숫자가 맞았는지 확인하는 변수
		int num = scan.nextInt();
				
		for(int i=0; i<10; i++){
			int rand_int = (int) ((Math.random())*50+1);	//랜덤수 받아옴
			System.out.print(rand_int + " ");				//랜덤수 출력
			if(num==rand_int){								//숫자가 맞는지 확인
				check += 1;									//맞으면 check값 증가
			}
		}
		
		if(check==0){										//check가 초기값이면 꽝 출력
			System.out.println("꽝! 다음기회에~");
		}
		else												 //그 외의 값 다 당첨 출력
			System.out.println("\n당첨!");
		scan.close();
	}

}