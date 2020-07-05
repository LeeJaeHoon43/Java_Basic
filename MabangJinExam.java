import java.io.*;//�Է�-1
public class MabangJinExam{
   public static void main(String[] ar)throws IOException{//�Է�-2
      BufferedReader br = //�Է�-3
         new BufferedReader(new InputStreamReader(System.in));

      System.out.print("����(Ȧ����) = ");
      int num = Integer.parseInt(br.readLine());

      int[][] mabang = new int[num][num];

      int row = 0; int col = num / 2;//������ġ�� ����.

      for(int i=1; i<=num*num; i++){
         mabang[row][col] = i;
         if(i % num == 0){
            row++; continue;
         }
         row--; col++;
         if(row<0) row = mabang.length-1; 
         if(col>mabang.length-1) col = 0;
      }//end for ȸ�����̸� �� ��

      System.out.println();
      for(int i=0; i<mabang.length; i++){
         for(int j=0; j<mabang[i].length; j++){
            System.out.print(mabang[i][j] + "\t");
         }
         System.out.println();
      }
   }
}