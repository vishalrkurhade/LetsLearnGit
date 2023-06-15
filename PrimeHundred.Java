Class PrimeHundred{ 
public static void main(String[] args) {
		 int c=0;
		 for (int i =1;i<=100;i++)
		 {
			c = 0;
			for(int j= 1;j<=i;j++) 
			{
				if(j%i==0) {
					c++;
					
			}
				if(c==2) {
			System.out.print (j+",");
			}
			}
		 }
	}
} 