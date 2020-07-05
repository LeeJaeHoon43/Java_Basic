import java.io.*;//입력-1
public class LottoGame{
   public static void main(String[] ar)throws IOException{//입력-2
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("몇 게임 하실건가요? = ");
      int game = Integer.parseInt(br.readLine());

      int[][] lotto = new int[game][6];

      for(int line=0; line<lotto.length; line++){ //game 수 만큼
         for(int col=0; col<lotto[line].length; col++){// 6
            lotto[line][col] = (int)(Math.random() * 45) + 1; // 1 ~ 45
            //컬럼간의 같은 값이 만들어 졌는지 비교
            for(int tCol=0; tCol<col; tCol++){
               if(lotto[line][col] == lotto[line][tCol]){
                  // 새로 만든 번호가 기존 번호와 중복
                  col--; break;
               }
            }//end for tempCol
         }//end for column

         // 여기 왔다는 것은 한 줄이 완전히 중복되는 값이 없이 만들어 졌다는 뜻.
         int count = 0;
         for(int tLine=0; tLine<line; tLine++){
            count = 0;
            for(int col=0; col<lotto[line].length; col++){ // 6
               for(int tCol=0; tCol<lotto[tLine].length; tCol++){ // 6
                  if(lotto[line][col] == lotto[tLine][tCol]){
                     //이전 값과 같은것이 있다.
                     count++; break;
                  }
               }//end tCol
               if(col == count){ // 값이 일치하지 않은게 최소한 하나는 있다.
                  break;
               }
            }//end col
            //여기 왔다는 것은 한 줄의 비교가 끝이 났다는 뜻.
            if(count == 6){// 지금 비교한 라인이 완전히 일치한다.
               line--; break;
            }
         }//end for tLine   
      }//end for line

      // 화면출력
      System.out.println();
      for(int i=0; i<lotto.length; i++){
         System.out.print(i + 1 + "번째 추천번호 : ");
         for(int j=0; j<lotto[i].length; j++){
            System.out.print(lotto[i][j] + "\t");
         }
         System.out.println();
      }
   }//end main
}
