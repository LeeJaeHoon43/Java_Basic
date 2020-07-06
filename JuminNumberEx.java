import java.io.*;//�Է�-1
import java.util.*;// ���̰��
public class JuminNumberEx{
   public static void main(String[] ar)throws IOException{//�Է�-2
      BufferedReader br = //�Է�-3
         new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("�̸� = ");
      String name = br.readLine();

      int[] jumin = new int[13];//�ֹι�ȣ
      System.out.print("�ֹι�ȣ = ");
      for(int i=0; i<jumin.length; i++){
         jumin[i] = System.in.read() - '0';
      }//end for
      System.in.read(); System.in.read();// Enter�� ó��
      
      /* �ֹι�ȣ �� üũ
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
         System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
         System.exit(0);
      }

      System.out.println();
      System.out.println(name + "���� �������� �м� ���");
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

      System.out.println("������� : " + year + "�� " + mon + 
                                 "�� " + day + "�ϻ�");

      System.out.println("���� : " + (jumin[6]%2==0 ? "����" : "����"));
      System.out.println("���� : " + 
         (Calendar.getInstance().get(Calendar.YEAR) - year + 1) + "��");

      switch(jumin[7]){
         case 0 : System.out.println("������� : ����"); break;
         case 1 : System.out.println("������� : ���"); break;
         case 2 : System.out.println("������� : ����"); break;
         case 3 : System.out.println("������� : ���"); break;
         case 4 : System.out.println("������� : �泲"); break;
         case 5 : System.out.println("������� : ����"); break;
         case 6 : System.out.println("������� : ����"); break;
         case 7 : System.out.println("������� : ���"); break;
         case 8 : System.out.println("������� : �泲"); break;
         case 9 : System.out.println("������� : ����"); break;
      }
   }
}