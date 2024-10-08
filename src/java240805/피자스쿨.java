package java240805;

class 피자{//피자 클래스 선언
  String 재료;
  String 재료2;
  /*
   * 파라미터 값이 다르다면 메소드 이름 중복 사용 가능(=> 오버로딩)
   */
  public void 출력하기() {
	  System.out.println(재료+","+재료2+"가 들어간 피자입니다.");
  }
  public void 출력하기(String 재료3) {//파라미터값이 들어간 메소드 선언
	 System.out.println(재료+","+재료2+","+재료3+"이(가) 들어간 피자입니다.");
  }
}

public class 피자스쿨 {

	public static void main(String[] args) {
		/*  퀴즈) 피자 객체를 생성하시오
		 *  아래와 같은 출력이 나오게 만드시오
		 *  1.불고기,치즈가 들어간 피자입니다. 가 나오게 만들어보세요.
		 *  2.파인애플,소고기가 들어간 피자입니다.가 나오게 만들어보세요.
		 *  3.재료3을 파라미터로 받는 메소드(리턴타입 void)를 선언하시고
		 *  => 불고기,치즈,파인애플가(이) 들어간 피자입니다.를 출력하시오.
		 */
		피자 pizza1 = new 피자();//피자 객체 생성
		pizza1.재료 = "불고기";
		pizza1.재료2 = "치즈";
		pizza1.출력하기();
		pizza1.출력하기("파인애플"); //파라미터에 값(파인애플) 대입
		
		피자 pizza2 = new 피자();
		pizza2.재료 = "파인애플";
		pizza2.재료2 = "소고기";
		pizza1.출력하기();
		
		
		
		
		
		
	}

}
