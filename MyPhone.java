import java.io.*;//�Է�-1
class Phone{
   public void call(String phoneNumber)throws IOException{
      System.out.println(phoneNumber + " ������ ������ȭ�� �մϴ�");
   }
}
class SmartPhone extends Phone{
   //���
   BufferedReader br;
   //������   
   public SmartPhone(){
      br = new BufferedReader(new InputStreamReader(System.in));
   }
   //�޼���
   @Override
   public void call(String phoneNumber)throws IOException{
      System.out.println("1. ������ȭ");
      System.out.println("2. ������ȭ");
      System.out.print("��ȭ���� : ");
      int choice = Integer.parseInt(br.readLine());
      if(choice == 1){
         super.call(phoneNumber);
      }else if(choice == 2){
         System.out.println(phoneNumber + " ������ ������ȭ�� �մϴ�");
      }else{
         System.out.println("�޴��Է� ���� : ��ȭ�� ����մϴ�.");
      }
   }
}
public class MyPhone{
   public static void main(String[] ar)throws IOException{//�Է�-2
      BufferedReader br = //�Է�-3
         new BufferedReader(new InputStreamReader(System.in));
      
      while(true){
         System.out.print("��ȭ�� �Ͻðڽ��ϱ�? (y/n) : ");
         String response = br.readLine();

         if(response.equals("N") || response.equals("n")){
            System.out.println("��ȭ�⸦ �����մϴ�.");
            System.exit(0);
         }

         System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
         String phoneNumber = br.readLine();

         Phone phone = new SmartPhone();
         phone.call(phoneNumber);

         System.out.println();
      }//end while
   }
}