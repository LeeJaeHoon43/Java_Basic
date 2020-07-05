import java.io.*;
public class JuminExample {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("이름 : ");
        String name = br.readLine();

        System.out.print("주민번호 : ");
        String juminS = br.readLine();

        int jumin[] =new int[13];

        float[] rule = {2.f, 3.f, 4.f, 5.f, 6.f, 7.f, 8.f, 9.f, 2.f, 3.f, 4.f, 5.f, 0f};
        float hap = 0;
        for(int i = 0 ; i  < jumin.length; i++){
            jumin[i] = Integer.parseInt(juminS.substring(i,i+1));
            hap += jumin[i]*rule[i]; //13번째
        }
        //마지막자리 확인 공식.
        float temp = 11.0f * (int)(hap/11.0f) + 11.0f - hap;
        float total = temp - 10.0f * (int)(temp/10.0f);

        System.out.println();

        if(jumin[jumin.length-1] != (int)total){
            System.out.println("잘못된 주민번호 입니다.");
        } else {
            System.out.println(name + "님의 개인정보 분석결과는");
            System.out.println("생년월일 : " +jumin[0]+jumin[1] + " 년 " + jumin[2]+jumin[3] + " 월" + jumin[4]+jumin[5]+ " 일");
            System.out.println("나이 : " +(2020-((jumin[0]*10)+ jumin[1] + 1900)));
            if(jumin[6]%2==0 ){
                System.out.println("성별 : 여");
            } else
                System.out.println("성별 : 남");
            switch (jumin[7]){
                case 0 :
                    System.out.println("출생지역 : 서울");
                    break;
                case 1 :
                    System.out.println("출생지역 : 경기");
                    break;
                case 2 :
                    System.out.println("출생지역 : 강원");
                    break;
                case 3 :
                    System.out.println("출생지역 : 충북");
                    break;
                case 4 :
                    System.out.println("출생지역 : 충남");
                    break;
                case 5 :
                    System.out.println("출생지역 : 전북");
                    break;
                case 6 :
                    System.out.println("출생지역 : 전남");
                    break;
                case 7 :
                    System.out.println("출생지역 : 경북");
                    break;
                case 8 :
                    System.out.println("출생지역 : 경남");
                    break;
                case 9 :
                    System.out.println("출생지역 : 제주");
                    break;
            }
        }
    }
}