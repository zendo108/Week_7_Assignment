/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inc108.classes;

/**
 *
 * @author IvanAranda
 */
public class MatrixManager {
    
    
    
    public void getPrimaryDiagonal(int[][] m){
        int sum = 0;
        if(m !=null && isSquareMatrix(m)){
            for(int i=0;i<m.length;i++){
                sum += m[i][i];
            }
            System.out.println("Primary Diagonal is: " + sum);
        }else{
            System.out.println("Number of columns and rows must be equal");
        }
    }
    
    public int getSecondaryDiagonal(int[][] m){
        int sum = 0;
        if(m !=null && isSquareMatrix(m)){
            for(int i=0, j=m[0].length-1;i<m.length;i++,j--){
                sum += m[i][j];
            }
            System.out.println("Primary Diagonal is: " + sum);
        }else{
            System.out.println("Number of columns and rows must be equal");
        }
        return 0;
    }
    
    boolean isSquareMatrix(int[][] m){
        
        if(m !=null && m.length == m[0].length){
            return true;
        }else{
            return false;
        }
        
    }
    /**
     * createMatrix takes in  columns and rows and an array of integers
     * that will be used to fill the array. Any integer exceeding the number
     * of integers the matrix needs will be ignored.
     * It returns the two dimensional array;
     * @param cols
     * @param rows
     * @param n
     * @return 
     */
    public int[][] createMatrix(int cols, int rows, int... n){
        int count = 0;
        int[][] matrix = null;
        if(cols == rows){
            matrix = new int[cols][rows];
            for(int i=0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if(count == n.length)
                        //The counter is reset and starts from 0
                        count = 0;
                    matrix[i][j] = n[count];
                    System.out.print(matrix[i][j]+" ");
                    
                    count++;
                }
                System.out.print("\n");
            }
            
        }else{
            System.out.println("Number of columns and rows must be equal");
        }
        return matrix;
    }
    
}
