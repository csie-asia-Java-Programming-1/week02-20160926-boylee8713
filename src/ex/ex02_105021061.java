package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021061 李柏毅
 */

	import java.util.Scanner;
	public class ex02_105021061 {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.println("請輸入座標");
			System.out.print("x=");
			int x = scn.nextInt();
			System.out.print("y=");
			int y = scn.nextInt();
			int dis=x*x+y*y;
			if(dis<=10000){
				System.out.println("點在圓內");
			}
			else{
				System.out.println("點在圓外");
			}
		}

	}