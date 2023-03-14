package final_mock;

public class pattern {
	public static void main(String[] args) {
		int num=25;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++){
				if(i<=(num/2+1)/2+1)
				{
					if((i+j==num/2+2||j-i==num/2))
					{
					System.out.print(i+""+j+" ");
					}else{
						System.out.print("   ");
					}
					
				}else if(i<=((num/2+1)+(num/2+1)/2)){
					if(i==j||i+j==num+1){
					System.out.print(i+""+j+" ");
				}else{
					System.out.print("   ");
				}
				}else {
					if(i-j==num/2||i+j==num+(num/2+1)){
					System.out.print(i+""+j+" ");
				}else{
					System.out.print("   ");
				}
					
				}
			
			}
			System.out.println();
		}
	}

}
