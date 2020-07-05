/*
# �ֹε�Ϲ�ȣ ����.
1���� �迭�� �����ϰ� ������ �ذ��� �� �ֽ��ϴ�.

1. �ֹε�Ϲ�ȣ Ȯ�ο���
�̸� : �ڼ��� (br.readLine();)
�ֹι�ȣ : 123456 1234567

int[] jumin = new jumin[13];
System.in.read(); //�̿��ؼ� �Է�
for(int i=0; i<jumin.length; i++)
    1       2       3       4       5       6      -    1        2       3      4       5        6       7
*  2.0     3.0     4.0     5.0     6.0     7.0         8.0      9.0     2.0    3.0     4.0      5.0
-----------------------------------------------------------------------------
    X  +   X   +  X  +   X   +   X  +   X   +             X  +  X   +  X  +  X  +  X  +  X  = Hap

Temp = 11.0f * (int)(Hap/11.0f) + 11.0f - Hap 
Total = Temp - 10.0f * (int)(Temp/10.0f)

 �ùٸ� �ֹι�ȣ : Total == 7���ڸ�...(jumin[jumin.length-1])
���� �ٸ��ٸ� �߸��� �ֹι�ȣ...

# �ֹε�� ��ȣ ���ڸ�
9, 0 : 1800�⵵
1, 2 : 1900�⵵
3, 4 : 2000�⵵
5, 6 : �ܱ���(1,2 ����)

2��° �ڸ� : ��, ��
3~4��° �ڸ� : ��
5~6��°�ڸ� : ��, ��, ��, ��

0 ����
1 ���
2 ����
3 ���
4 �泲
5 ����
6 ����
7 ���
8 �泲
9 ����

7��° �ڸ�
������

����̸�
___���� �������� �м������
������� : ____�� __�� __�ϻ�
���� : __��
���� : x��
������� :  ____ ����

�����̸�
�߸��� �ֹε�Ϲ�ȣ�Դϴ�.
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
      // �ֹι�ȣ�� �޾Ƽ� input�迭�� �ֱ� �Ϸ�
      float hap = 0.f;
      for (int i=0; i<8; i++){
         hap += input[i] * (i+2);
      }
      hap = hap + input[8]*2.f + input[9]*3.f + input[10]*4.f + input[11]*5.f;
      // hap ���ϱ� �Ϸ�

      float temp = 11.0f * (int)(hap/11.0f) + 11.0f - hap;
   
      float total = temp - 10.0f * (int)(temp/10.0f);   
      
      
      System.out.print("�̸��Է� : ");
      name = br.readLine();


      if(total != input[input.length-1]){
         System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
      } else {
         System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�.");
         
         age = 2020 - (1900 + input[0]*10 + input[1]*1) + 1; 
   
         if (input[6] == 1) sex = "��";
         else if(input[6] == 2) sex = "��";
         // input[6] ���� ���� ���� 1900���� 1�� 2

         switch(input[7]) {
            case 0:
               region="����"; break;
            case 1:
               region="���"; break;
            case 2:
               region="����"; break;
            case 3:
               region="���"; break;
            case 4:
               region="�泲"; break;
            case 5:
               region="����"; break;
            case 6:
               region="����"; break;
            case 7:
               region="���"; break;
            case 8:
               region="�泲"; break;
            case 9:
               region="����"; break;
         }
         // input[7] 0~9���� �¾ ����

         System.out.println(name + " ���� �������� �м������");
         System.out.println("������� " + 19 + input[0] + input[1] +"�� " 
            + input[2] + input[3] + "�� " 
            + input[4] + input[5] + "�ϻ� ");
         System.out.println("��   �� : " + age + "��");
         System.out.println("��   �� : " + sex + "��");
         System.out.println("������� : " + region + "����");
      }
   }
}