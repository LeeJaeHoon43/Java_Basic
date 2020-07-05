import java.io.*;
public class JuminExample {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("�̸� : ");
        String name = br.readLine();

        System.out.print("�ֹι�ȣ : ");
        String juminS = br.readLine();

        int jumin[] =new int[13];

        float[] rule = {2.f, 3.f, 4.f, 5.f, 6.f, 7.f, 8.f, 9.f, 2.f, 3.f, 4.f, 5.f, 0f};
        float hap = 0;
        for(int i = 0 ; i  < jumin.length; i++){
            jumin[i] = Integer.parseInt(juminS.substring(i,i+1));
            hap += jumin[i]*rule[i]; //13��°
        }
        //�������ڸ� Ȯ�� ����.
        float temp = 11.0f * (int)(hap/11.0f) + 11.0f - hap;
        float total = temp - 10.0f * (int)(temp/10.0f);

        System.out.println();

        if(jumin[jumin.length-1] != (int)total){
            System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
        } else {
            System.out.println(name + "���� �������� �м������");
            System.out.println("������� : " +jumin[0]+jumin[1] + " �� " + jumin[2]+jumin[3] + " ��" + jumin[4]+jumin[5]+ " ��");
            System.out.println("���� : " +(2020-((jumin[0]*10)+ jumin[1] + 1900)));
            if(jumin[6]%2==0 ){
                System.out.println("���� : ��");
            } else
                System.out.println("���� : ��");
            switch (jumin[7]){
                case 0 :
                    System.out.println("������� : ����");
                    break;
                case 1 :
                    System.out.println("������� : ���");
                    break;
                case 2 :
                    System.out.println("������� : ����");
                    break;
                case 3 :
                    System.out.println("������� : ���");
                    break;
                case 4 :
                    System.out.println("������� : �泲");
                    break;
                case 5 :
                    System.out.println("������� : ����");
                    break;
                case 6 :
                    System.out.println("������� : ����");
                    break;
                case 7 :
                    System.out.println("������� : ���");
                    break;
                case 8 :
                    System.out.println("������� : �泲");
                    break;
                case 9 :
                    System.out.println("������� : ����");
                    break;
            }
        }
    }
}