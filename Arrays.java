//Evaan J
//Jan. 5
//2d arrays
import java.util.Scanner;

public class Arrays {
    
    Scanner scanner1 = new Scanner (System.in);
    
    public static void main (String [] args){

        Arrays table = new Arrays(); 
        int rowValue=0;
        int columnValue=0;
        int [][] cordinate1 = new int [0][0];
        int [][] cordinate2 = new int [0][0];
        
        for(int p=0; p<5 ; p=p+0){
            
            rowValue = table.rowInput(0);
            if(rowValue==-1){
                break;
            }
            columnValue = table.columnInput(0);
            if(columnValue==-1){
                break;
            }
            cordinate1 = table.create(rowValue,columnValue);

            table.print(rowValue,columnValue,cordinate1);
            cordinate2 = table.update( cordinate1);
              
        }
        table.print(rowValue,columnValue,cordinate2);
        
    }
    public int rowInput(int r ){
        System.out.println("choose a number of rows");
        //Setting the scanner equal to a int so it can be used later on in the code
        r = scanner1.nextInt();
        return r;
    }
    public int columnInput(int c ){
        System.out.println("choose a number of columns");
        c = scanner1.nextInt();
        return c;
    }
    public int [][]create(int rowC,int colC){

        int [][] cordinate = new int [rowC][colC];
    
        //Creating a for loop thatwould start the row vlaue from zero and keep moving upwards until the vlaue 
        //is less than the user input
        for(int w=0; w<rowC ; w++){

            //Creating a for loop thatwould start the column vlaue from zero and keep moving upwards until the vlaue 
            //is less than the user input
            for(int j=0; j<colC ; j++){

                //Giving the cordinates random values
                cordinate [w][j] = (int)(Math.random()*11);   
            }
        }
        return cordinate;
    }
    public void print(int rowP,int colP,int cor2[][]){
        
        System.out.println("hi");
    
    for(int w=0; w<rowP ; w++){
        for(int j=0; j<colP ; j++){
            
            //Printing out the column values of row "w"
            System.out.print (cor2 [w][j]+"  ");
        }
        System.out.println();
        System.out.println();
    }
        
    }
    public int [][] update(int cor3[][]){
        
        System.out.println("What is the row of the cordinate you would like to change?");
        int rowUpdate = scanner1.nextInt();

        System.out.println("What is the column of the cordinate you would like to change?");
        int columnUpdate = scanner1.nextInt();

        System.out.println("What is the new value you would like to add?");
        int updateValue = scanner1.nextInt();
        
        cor3[rowUpdate-1][columnUpdate-1] = updateValue;
        return cor3;
    }

}    