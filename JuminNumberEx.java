import java.io.*;//입력-1
import java.util.*;// 나이계산
public class JuminNumberEx{
   public static void main(String[] ar)throws IOException{//입력-2
      BufferedReader br = //입력-3
         new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("이름 = ");
      String name = br.readLine();

      int[] jumin = new int[13];//주민번호
      System.out.print("주민번호 = ");
      for(int i=0; i<jumin.length; i++){
         jumin[i] = System.in.read() - '0';
      }//end for
      System.in.read(); System.in.read();// Enter값 처리
      
      /* 주민번호 값 체크
      for(int i=0; i<jumin.length; i++){
         System.out.println("jumin[" + i + "] = " + jumin[i]);
      }*/

      float hap = 0.f; float temp = 0.f; float total = 0.f;
      float cre = 2.f;
      for(int i=0; i<jumin.length-1; i++){
         if(cre == 10.f) cre = 2.f;
         hap += jumin[i] * cre;
         cre++;
      }//end for

      temp = 11.f * (int)(hap/11.f) + 11.f - hap;
      total = temp - 10.f * (int)(temp/10.f);
      
      //System.out.println("total = " + total);
      //total = total - (int)total;  if(total != 0) ...

      if((int)total != jumin[jumin.length-1]){
         System.out.println("잘못된 주민번호 입니다.");
         System.exit(0);
      }

      System.out.println();
      System.out.println(name + "님의 개인정보 분석 결과");
      int year = 1900;
      int mon =0; int day=0;

      switch(jumin[6]){
         case 0 :
         case 9 : year = 1800; break;
         case 3 :
         case 4 : year = 2000; break;
         default : year = 1900; break;
      }

      year += jumin[0]*10 + jumin[1];
      mon = jumin[2]*10 + jumin[3];
      day = jumin[4]*10 + jumin[5];

      System.out.println("생년월일 : " + year + "년 " + mon + 
                                 "월 " + day + "일생");

      System.out.println("성별 : " + (jumin[6]%2==0 ? "여성" : "남성"));
      System.out.println("나이 : " + 
         (Calendar.getInstance().get(Calendar.YEAR) - year + 1) + "세");

      switch(jumin[7]){
         case 0 : System.out.println("출생지역 : 서울"); break;
         case 1 : System.out.println("출생지역 : 경기"); break;
         case 2 : System.out.println("출생지역 : 강원"); break;
         case 3 : System.out.println("출생지역 : 충북"); break;
         case 4 : System.out.println("출생지역 : 충남"); break;
         case 5 : System.out.println("출생지역 : 전북"); break;
         case 6 : System.out.println("출생지역 : 전남"); break;
         case 7 : System.out.println("출생지역 : 경북"); break;
         case 8 : System.out.println("출생지역 : 경남"); break;
         case 9 : System.out.println("출생지역 : 제주"); break;
      }
   }
}