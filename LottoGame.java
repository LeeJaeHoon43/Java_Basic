import java.io.*;//�Է�-1
public class LottoGame{
   public static void main(String[] ar)throws IOException{//�Է�-2
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("�� ���� �Ͻǰǰ���? = ");
      int game = Integer.parseInt(br.readLine());

      int[][] lotto = new int[game][6];

      for(int line=0; line<lotto.length; line++){ //game �� ��ŭ
         for(int col=0; col<lotto[line].length; col++){// 6
            lotto[line][col] = (int)(Math.random() * 45) + 1; // 1 ~ 45
            //�÷����� ���� ���� ����� ������ ��
            for(int tCol=0; tCol<col; tCol++){
               if(lotto[line][col] == lotto[line][tCol]){
                  // ���� ���� ��ȣ�� ���� ��ȣ�� �ߺ�
                  col--; break;
               }
            }//end for tempCol
         }//end for column

         // ���� �Դٴ� ���� �� ���� ������ �ߺ��Ǵ� ���� ���� ����� ���ٴ� ��.
         int count = 0;
         for(int tLine=0; tLine<line; tLine++){
            count = 0;
            for(int col=0; col<lotto[line].length; col++){ // 6
               for(int tCol=0; tCol<lotto[tLine].length; tCol++){ // 6
                  if(lotto[line][col] == lotto[tLine][tCol]){
                     //���� ���� �������� �ִ�.
                     count++; break;
                  }
               }//end tCol
               if(col == count){ // ���� ��ġ���� ������ �ּ��� �ϳ��� �ִ�.
                  break;
               }
            }//end col
            //���� �Դٴ� ���� �� ���� �񱳰� ���� ���ٴ� ��.
            if(count == 6){// ���� ���� ������ ������ ��ġ�Ѵ�.
               line--; break;
            }
         }//end for tLine   
      }//end for line

      // ȭ�����
      System.out.println();
      for(int i=0; i<lotto.length; i++){
         System.out.print(i + 1 + "��° ��õ��ȣ : ");
         for(int j=0; j<lotto[i].length; j++){
            System.out.print(lotto[i][j] + "\t");
         }
         System.out.println();
      }
   }//end main
}
