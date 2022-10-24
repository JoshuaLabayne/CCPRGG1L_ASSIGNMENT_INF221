public class App {
    public static void main(String[] args) throws Exception {

        char [][] arrayName = {{'1','1','1'},{'1','1','1'},{'1','1','1'},{'1','1','1'}};
       
        //Pattern #1
        System.out.println(" ");
        System.out.println("1. PATTERN 1");

        for (int rows = 0; rows < arrayName.length; rows++) {
            System.out.println("");
            System.out.print("Rows " + rows + " :");
          
            
            for (int columns = 0; columns < 3; columns++) 
              
                
                if (rows % 2 == 0)
                    System.out.print("");
                
                else if (rows % 2 !=0)
                    System.out.print(arrayName[rows][columns] );
                
            
        }
  


        //Pattern #2
        System.out.println(" ");
        System.out.println("2. PATTERN 2");
       
        for (int rows = 0; rows < arrayName.length; rows++) {
            System.out.println("");
            System.out.print("Rows " + rows + " :");
          
            
            for (int columns = 0; columns < 3; columns++) {
              
                
                if (rows % 2 != 0){
                    System.out.print(" " );
                }
                else if (rows % 2 ==0){
                    System.out.print(arrayName[rows][columns] );
                }           
            } 
         }
         

        //Pattern #3
        System.out.println(" ");
        System.out.println("3. PATTERN 3");
       
        for (int rows = 0; rows < arrayName.length; rows++) {
            System.out.println("");
            System.out.print("Rows " + rows + " :");

            
            for (int columns = 0; columns < 3; columns++) {
              
                
                if (rows == 1 ||rows == 2) 
                    if (columns == 0 || columns == 2)                    
                        System.out.print(" " );
                    else if (columns == 1)
                    System.out.print(arrayName[rows][columns] );
                 
                 if (rows == 0|| rows == 3)
                    System.out.print(arrayName[rows][columns] );
                          
            } 
         }
        
        
         System.out.println(" ");
         System.out.println("4. PATTERN 4");
        
         for (int rows = 0; rows < arrayName.length; rows++) {
             System.out.println("");
             System.out.print("Rows " + rows + " :");
             
             
             for (int columns = 0; columns < 3; columns++) {
               
                 
                 if (rows == 0||rows == 2) 
                     if (columns == 0 || columns == 2)                    
                         System.out.print(" " );
                     else if (columns == 1)
                     System.out.print(arrayName[rows][columns] );
                  
                  if (rows == 1|| rows == 3)
                     System.out.print(arrayName[rows][columns] );

                 }
            
            }

         System.out.println(" ");
         System.out.println("5. PATTERN 5");
            
         int i, j, row_sum = 0, sum;  
            int[][] SumOfRowCols_arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};       
    
            for(i = 0; i < SumOfRowCols_arr.length; i++){
             sum = 0; 
               
              for(j = 0; j < SumOfRowCols_arr[0].length; j++) {
    
                    row_sum = row_sum + SumOfRowCols_arr[i][j];
                }              
            }    
                System.out.println ("Sum : " + row_sum);
    
    }

}
               
    
