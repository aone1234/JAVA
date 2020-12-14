package kr.co.kihd.array2;

public class TwoDArrayTest2 {

	public static void main(String[] args) {
		
		
		int[][] score = new int[][] 
			{
									  {100,70,50},
									  {70,50,30},
									  {50,80,70},
									  {55,85,77},
									  {100,80,50}
			};

			int korTotal = 0;            					// 국어총점
			int engTotal = 0;            					// 영어총점
			int mathTotal = 0;           					// 수학총점
			int totalsum = 0;          					// 개인별 총점의 합계
			double totalavg = 0.0;       					// 개인별 평균의 평균
			
			
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			System.out.println("=============================================");
			
			for(int i=0; i<score.length; i++)
			{
				int sum = 0;        						// 개인별 총점
				double avg = 0.0;    						// 개인별 평균
				
				korTotal += score[i][0];
				engTotal += score[i][1];
				mathTotal += score[i][2];
				
				System.out.print(i+1);         			// 번호 출력
				for(int j=0; j<score[i].length; j++) 
				{
					sum += score[i][j];    				    // 개인별 총점
					System.out.print("\t" + score[i][j]);   // 국영수 출력
				}
				
				totalsum += sum;    						// 개인별 총첨의 합계
				avg = (double)sum/score[i].length;          // 개인별 평균
				totalavg += avg;                            // 개인별 평균의 합계
				
				// 개인별 총점, 개인별 평균
				// System.out.print("\t" +sum+ "\t" + avg + "\n");
				
				// printf() %d <-- 형식지정자의 갯수만큼 그에 대입한느 변수가 구분되어 제시.
				System.out.printf("\t%d \t%.2f \n", sum, avg);
				
			}
			
			totalavg /= score.length;         				// 개인별 평균의 평균
			System.out.printf("총점\t %d\t %d\t %d\t %d\t%.2f", 
					          korTotal, engTotal, mathTotal, totalsum, totalavg);
			
	}

}
