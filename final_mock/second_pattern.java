package final_mock;

public class second_pattern {
		public static void main(String[] args) {
			int no=5;
			for(int i=1;i<=no;i++){
				for(int j=1;j<=3;j++){
					if(i-j==-1||i-j==1||i-j==3){
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		}

}
