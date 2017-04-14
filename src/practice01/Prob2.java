package practice01;

public class Prob2 {
	public static void main(String[] args) {
		
		int[] number={1,2,6,4,5,6,7,8,9,10};
		//이중포문
		
		int num1=0;
		
		for(int i=0;i<5;i++){
			
			for(int j=0; j<10; j++){
				
				
				System.out.print(number[j]+" ");
				
			}	
			
			
			for(int n=0;n<10;n++){
				
				if(n==0){
					num1=number[n];
					number[n]=number[n+1];
				}
				else if(n==9){
					number[n]=num1+10;
				}
				else
				number[n]=number[n+1];
				
				
			}
				
			System.out.println();
				
				
			}
			
			
			
		}
			

	
}