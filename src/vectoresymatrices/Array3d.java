
package vectoresymatrices;

public class Array3d {
    
    
    int [] [] [] intArray = new int[2][3][4];
    
    public static void ejemplo3D(){
    //initialize 3-d array
        int[][][] intArray = { { { 1, 2, 3}, { 4, 5, 6 } ,  { 7, 8, 9 } } }; 
        System.out.println ("3-d array is given below :");
        //print the elements of array
        for (int i = 0; i < 1; i++) 
            for (int j = 0; j < 3; j++) 
            for (int z = 0; z < 3; z++) 
                System.out.println ("intArray [" + i 
            + "][" + j + "][" + z + "] = " + intArray [i][j][z]); 
    }
    
    public static void ejemplo2()
    {
        //initialize 3-d array
        int[][][] myArray = { { { 1, 2, 3 }, { 4, 5, 6 } },  { { 1, 4, 9 }, { 16, 25, 36 } },
                { { 1, 8, 27 }, { 64, 125, 216 } } }; 
        System.out.println("3x2x3 array is given below:");
        //print the 3-d array
        for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 2; j++) { 
        for (int k = 0; k < 3; k++) { 
        System.out.print(myArray[i][j][k] + "\t"); 
        }   
        System.out.println(); 
                    } 
        System.out.println(); 
        } 
    }
}
