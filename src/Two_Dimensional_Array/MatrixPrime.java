package Two_Dimensional_Array;

public class MatrixPrime {

	public static void main(String[] args) {

		int i, j, k, n = 2, a[][] = new int[3][3];

        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                
            	while (true) {
                
            		boolean flag = true;
                    
            		for (k = 2; k <= Math.sqrt(n); k++)
                        if (n % k == 0) {
                            flag = false;
                            break;
                        }
                    
            		if (flag == true) {
                        a[i][j] = n++;
                        break;
                    }
                    
            		n++;
                }
            }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        
	}

}
