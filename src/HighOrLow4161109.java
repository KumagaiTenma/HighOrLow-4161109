import java.util.Random;
import java.util.Scanner;
public class HighOrLow4161109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int ran = rnd.nextInt(10)+1;
		int nar = rnd.nextInt(10)+1;
		int i = 0;//ゲームの回数
		int a = 0;// 正解数
		int b = 0;//不正解数
		System.out.println("ランダム生成された数字");
		System.out.println("どっちが大きいでしょう？");
		System.out.println("3回勝負だよ！");

		do{
		System.out.println("1番？ 2番？");
		System.out.print("選択してね！:");
		int j = sc.nextInt();
		if(j < 0 || j > 3){
			System.exit(0);

		}
		if(ran < nar && j == 1){
			System.out.println("1番:" +ran);
			System.out.println("2番:" +nar);
			System.out.println("正解！おめでとー");
			i++;
			a++;

		}
		else if(ran < nar && j ==2){
			System.out.println("1番:" +ran);
			System.out.println("2番:" +nar);
			System.out.println("不正解！ざんねーん");
			i++;
			b++;
		}
		else if(ran > nar && j ==1){
			System.out.println("1番:" +ran);
			System.out.println("2番:" +nar);
			System.out.println("不正解！ざんねーん");
			i++;
			b++;
		}
		else if(ran > nar && j == 2){
			System.out.println("1番:" +ran);
			System.out.println("2番:" +nar);
			System.out.println("正解！おめでとー");
			i++;
			a++;
		}
		}while(i < 3);

		if(a > b){
			System.out.println(a + "回正解したよ！おめでとー！");
		}
		else if(b > a){
			System.out.println(b +"回不正解！ざんねーん...");

		}
		System.out.println("また遊んでね！");

		sc.close();
	}

}
