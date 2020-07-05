import java.io.*;//입력-1
class Phone{
   public void call(String phoneNumber)throws IOException{
      System.out.println(phoneNumber + " 번으로 음성통화를 합니다");
   }
}
class SmartPhone extends Phone{
   //멤버
   BufferedReader br;
   //생성자   
   public SmartPhone(){
      br = new BufferedReader(new InputStreamReader(System.in));
   }
   //메서드
   @Override
   public void call(String phoneNumber)throws IOException{
      System.out.println("1. 음성통화");
      System.out.println("2. 영상통화");
      System.out.print("통화선택 : ");
      int choice = Integer.parseInt(br.readLine());
      if(choice == 1){
         super.call(phoneNumber);
      }else if(choice == 2){
         System.out.println(phoneNumber + " 번으로 영상통화를 합니다");
      }else{
         System.out.println("메뉴입력 오류 : 통화를 취소합니다.");
      }
   }
}
public class MyPhone{
   public static void main(String[] ar)throws IOException{//입력-2
      BufferedReader br = //입력-3
         new BufferedReader(new InputStreamReader(System.in));
      
      while(true){
         System.out.print("통화를 하시겠습니까? (y/n) : ");
         String response = br.readLine();

         if(response.equals("N") || response.equals("n")){
            System.out.println("전화기를 종료합니다.");
            System.exit(0);
         }

         System.out.print("전화번호를 입력하세요 : ");
         String phoneNumber = br.readLine();

         Phone phone = new SmartPhone();
         phone.call(phoneNumber);

         System.out.println();
      }//end while
   }
}