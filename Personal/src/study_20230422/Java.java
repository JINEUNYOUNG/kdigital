
//	숫자->문자 		 *숫자+'0'     (char)(3+'0');
//	문자->숫자 		 *문자-'0'
//	숫자->문자열	 *숫자+""
//	문자->문자열 	 *문자+""
//	문자열->숫자     *Integer.parseInt(string s 그러나 반드시 숫자인) 
//					integer : 정수 / parse 분석하다 라는 뜻. 
//	문자열->문자 	 *.charAt(0)
		
//	======================================================================
		
//  +=  -+ 	*=	/=	%=	<<=
//	& and \ or 
//	^= xor  a와b가 둘다 맞거나 틀리면 0 하나만 맞으면 1  

// =============================================================================
		
//	== 는 메모리 위치를 묻는것 (new string으로 객체를 지정해주면서 위치가 바뀌기 때문에 
//		equals를 써줘야하는것.
//	equals 는 안에 들어있는 값을 묻는 것 
		
// =============================================================================

//	static 이란? 
//  정적인. 움직이지 않는 / 자주 사용되고 절대 변하지 않는 변수!는 final static으로 선언하자. 
//  static으로 선언하면 클래스 변수가 된다. 기본값이 존재한다. 클래스가 로딩될 때 초기화한다. 클래스.변수로 참조하면 된다. 
//  static 초기화블록이란 ?
//  최초 로딩될 떄 수행되기 때문에 복잡한 초기화 과정을 수행 할 시 사용
//  +instance 초기화블록 ? 모든 생성자가 공통적인 내용을 수행해야 할 때 

// =============================================================================

//  for (초기화;조건식;증감식){
//	}

// =============================================================================

// 클래스이름은 파일이름과 같아야 하며, public클래스의 이름이어야함. 
// 퍼블릭이 없다면 어떤것도 ㅇㅋ 근데 퍼블릭이 두개 일 순 없다. 