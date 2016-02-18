
/**
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rnd = new Random();     // Randomクラスのインスタンス化

		int end = 0;
		int ran = rnd.nextInt() % 101;// 乱数作成
		if (ran < 0) {     // もし乱数がマイナスだったら-1をかけてプラスに
			ran *= -1;
		}
		boolean f = true;

		System.out.println("数あてげぇぇぇぇぇぇぇむ！！！！！！"
				+ "\n1から100の数字を入力してまおうをこうげきしよう。"
				+ "\n正解の数字はランダムで作成しますそれを当ててください");

		while (end == 0) {
			while(f){
				try {
					System.out.println("1～100の数字を入力してください、終了するときは0を入力してください");
					String str = br.readLine();
					if (isNumber(str)) {
						int nu = Integer.parseInt(str);

						if (nu == 0) {
							System.out.println("にげた");
							end = 1;
							break;
							}

						if (nu == ran) {
							System.out.println("ド○スト(キッチンの汚れがしっかり取れます)をとなえた！\n" +  str +"のダメージ\nまおうをたおした。"
									+ "\nぐあぁぁぁぁーーーよくぞわたしをたおした。"
									+ "\nしかし\nわたしをたおしてもだい2だい3のわたしがいるぞぉぉぉぉぉぉ！"
									+ "\n\nせかいはへいわになった\nSpecialThanks");
							end = 1;
							break;
						}

						if (nu >= 1 && nu <= 100) {
							if (nu < ran) {
								System.out.println("まおうに" + str + "のダメージ。（もっと大きい数字です。）");
							}
							else if( nu > ran ) {
								System.out.println("こうげきをかわされた。（もっと小さい数字です。）");
							}
							if (nu == 50){
								System.out.println("ゴンガガはばしゃにもどった。");
							}
							else if (nu == 25){
								System.out.println("ス○りんはばしゃにもどった。");
							}
							else if (nu == 75){
								System.out.println("まおうはどくのいきをはいた。どくになった。");
							}
						}
						else {
							System.out.println("こうげきをかわされた。（数字は100迄です。）");
							continue;
						}
					}
					else {
						System.out.println("ん？どうした？何をしている？（数字を入力してください。）");
						continue;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("TheEnd");
	}

	public static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}