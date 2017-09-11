import java.util.Random;
import java.util.Scanner;
public class HighOrLow4161109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int ran = rnd.nextInt(10)+1;
		System.out.println("1~10までのどれかを入力しよう！");
		System.out.print("数字:");
		int i = sc.nextInt();
		if(i < 0 || i > 10){

			System.exit(0);
		}
		System.out.println("ランダム生成される数字と今入植した数字");
		System.out.println("どっちが大きいでしょう？");

		System.out.println("1:あなた 2:ランダム");
		System.out.print("選択:");
		int j = sc.nextInt();
		if(j < 0 || j > 3){
			System.exit(0);

		}
		if(ran < i && j == 1){
			System.out.println("ランダム:" +ran);
			System.out.println("正解！おめでとー");

		}
		else if(ran < i && j ==2){
			System.out.println("ランダム:" +ran);
			System.out.println("不正解！ざんねーん");
		}
		else if(ran > i && j ==1){
			System.out.println("ランダム:" +ran);
			System.out.println("不正解！ざんねーん");
		}
		else if(ran > i && j == 2){
			System.out.println("ランダム:" +ran);
			System.out.println("正解！おめでとー");
		}
		System.out.println("また遊んでね！");

		sc.close();

	}

}
