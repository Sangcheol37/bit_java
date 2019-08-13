package day03_ex;

public class Prob3 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		// 프로그램 구현부 끝.
		// 암호화해서 보낸걸 복화하는 방법도 추가
		for (int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			if ((int) c < 120) {
				if (c == ' ') {
					//encodedString += " ";
					encodedString += (char)c;
				}
				else
					encodedString += (char) (c + 3);
			}

			else {
				encodedString += (char) (c - 23);

			}
		}
		
		/* 
		 
		 for(int i=0;i<=sourceString.length()-1;i++){
		 	char c = sourceString.charAt(i);
		 	if(c=='x'||c=='y'||c=='z'){
		 		encodedSting += (char)(c-23);
		 	}
		 	if(c==' '){
		 		encodedSting += c;
		 	}
		 	if('a'<=c && c<'w'){
		 		encodedString += (char)c+3;
		 	}
		 }
		 */
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
		
		System.out.println("==============================================");
	
		int k=0;
		for(int j=1;j<=10;j++) {
			for(int i=1;i<=j;i++) {
				k+=i;
			}
		}
		System.out.printf("%d\n",k);
	}

}
