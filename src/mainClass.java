
import com.inc108.classes.MatrixManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IvanAranda
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static final int NUMBER_Of_COLUMNS = 3;
    public static final int NUMBER_Of_ROWS = 3;
    
    public static void main(String[] args) {
        // TODO code application logic here
        MatrixManager myMatrixManager = new MatrixManager();
        int[][] m = myMatrixManager.createMatrix(NUMBER_Of_COLUMNS,NUMBER_Of_ROWS,6,2,3,3,1,6,7,5,9);
        
//        for(int[] r: m){
//            for(int c: r){
//                System.out.println(c);
//            }
//        }
        
        myMatrixManager.getPrimaryDiagonal(m);
        myMatrixManager.getSecondaryDiagonal(m);
    }
    
}
