package cath;

public class MatrixTranspose {

	public static void main(String[] args) {
		int [][] m = new int [3][];
		int [][] r = new int [3][];
		
		for (int row=0; row<m.length; row++ ) {
			m [row] = new int [3];
			r [row] = new int [3];
			for (int col=0; col<m[row].length; col++) {
				m[row][col] = (int) Math.round(Math.random()*100);
				System.out.print(m[row][col] + " ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for (int row=0; row<m.length; row++ ) {
			for (int col=0; col<m[row].length; col++) {
				r [row][col]=m[col][row]; 
				
			}
		}
			
			for (int row=0; row<r.length; row++ ) {
				for (int col=0; col<r[row].length; col++) {
					
					
					System.out.print(r[row][col]+ " ");
				}
				
			System.out.println();
				
			}
	}
}


