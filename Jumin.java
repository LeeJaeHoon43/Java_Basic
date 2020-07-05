/*
# 주민등록번호 문제.
1차원 배열을 이해하고 있으면 해결할 수 있습니다.

1. 주민등록번호 확인여부
이름 : 박성현 (br.readLine();)
주민번호 : 123456 1234567

int[] jumin = new jumin[13];
System.in.read(); //이용해서 입력
for(int i=0; i<jumin.length; i++)
    1       2       3       4       5       6      -    1        2       3      4       5        6       7
*  2.0     3.0     4.0     5.0     6.0     7.0         8.0      9.0     2.0    3.0     4.0      5.0
-----------------------------------------------------------------------------
    X  +   X   +  X  +   X   +   X  +   X   +             X  +  X   +  X  +  X  +  X  +  X  = Hap

Temp = 11.0f * (int)(Hap/11.0f) + 11.0f - Hap 
Total = Temp - 10.0f * (int)(Temp/10.0f)

 올바른 주민번호 : Total == 7번자리...(jumin[jumin.length-1])
만약 다르다면 잘못된 주민번호...

# 주민등록 번호 뒷자리
9, 0 : 1800년도
1, 2 : 1900년도
3, 4 : 2000년도
5, 6 : 외국인(1,2 포함)

2번째 자리 : 시, 도
3~4번째 자리 : 구
5~6번째자리 : 읍, 면, 동, 리

0 서울
1 경기
2 강원
3 충북
4 충남
5 전북
6 전남
7 경북
8 경남
9 제주

7번째 자리
검증값

사실이면
___님의 개인정보 분석결과는
생년월일 : ____년 __월 __일생
나이 : __세
성별 : x성
출생지역 :  ____ 지역

거짓이면
잘못된 주민등록번호입니다.
*/
import java.io.*;
public class Jumin{
   public static void main(String[] ar) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String name = "";
      int year = 0;
      int month = 0;
      int day = 0;
      int age = 0;
      String sex = "";
      String region = "";

      int[] input = new int[ar.length];
      
      for (int i=0; i<ar.length; i++){
         input[i] = Integer.parseInt(ar[i]);
      }
      // 주민번호를 받아서 input배열에 넣기 완료
      float hap = 0.f;
      for (int i=0; i<8; i++){
         hap += input[i] * (i+2);
      }
      hap = hap + input[8]*2.f + input[9]*3.f + input[10]*4.f + input[11]*5.f;
      // hap 구하기 완료

      float temp = 11.0f * (int)(hap/11.0f) + 11.0f - hap;
   
      float total = temp - 10.0f * (int)(temp/10.0f);   
      
      
      System.out.print("이름입력 : ");
      name = br.readLine();


      if(total != input[input.length-1]){
         System.out.println("잘못된 주민번호 입니다.");
      } else {
         System.out.println("올바른 주민번호 입니다.");
         
         age = 2020 - (1900 + input[0]*10 + input[1]*1) + 1; 
   
         if (input[6] == 1) sex = "남";
         else if(input[6] == 2) sex = "여";
         // input[6] 남성 여성 구분 1900년대는 1과 2

         switch(input[7]) {
            case 0:
               region="서울"; break;
            case 1:
               region="경기"; break;
            case 2:
               region="강원"; break;
            case 3:
               region="충북"; break;
            case 4:
               region="충남"; break;
            case 5:
               region="전북"; break;
            case 6:
               region="전남"; break;
            case 7:
               region="경북"; break;
            case 8:
               region="경남"; break;
            case 9:
               region="제주"; break;
         }
         // input[7] 0~9까지 태어난 지역

         System.out.println(name + " 님의 개인정보 분석결과는");
         System.out.println("생년월일 " + 19 + input[0] + input[1] +"년 " 
            + input[2] + input[3] + "월 " 
            + input[4] + input[5] + "일생 ");
         System.out.println("나   이 : " + age + "세");
         System.out.println("성   별 : " + sex + "성");
         System.out.println("출생지역 : " + region + "지역");
      }
   }
}