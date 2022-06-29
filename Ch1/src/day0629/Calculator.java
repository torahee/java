package day0629;


import java.util.Scanner;

/*
	사칙연산을 하는 계산기 클래스를 작성하시오
	
	int result;
	더하기 add()
	빼기 sub()
	곱하기 mul()
	나누기 div()

*/
class Clculator {

	   int x, y, sum;

	   public Clculator(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	   int add() {
	      sum = x + y;
	      return sum;
	   }

	   int sub() {
	      sum = x - y;
	      return sum;
	   }

	   int mul() {
	      sum = x * y;
	      return sum;
	   }

	   int div() {
	      sum = x / y;
	      return sum;
	   }

	}

public class Calculator {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("두 수를 입력하세용");
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      System.out.printf("입력한 수는[%d] || [%d] 입니다.", a, b);
	      System.out.println(" ");
	      Clculator cl1 = new Clculator(a, b);

	      while (true) {
	         System.out.println("==================================");
	         System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
	         System.out.println("===================================");
	         System.out.println("원하는 걸 입력하세요");
	         int c = sc.nextInt();
	         if (c == 1) {
	            System.out.println(cl1.add());
	         } else if (c == 2) {
	            System.out.println(cl1.sub());
	         } else if (c == 3) {
	            System.out.println(cl1.mul());
	         } else if (c == 4) {
	            System.out.println(cl1.div());
	         }

	      }

	   }
}