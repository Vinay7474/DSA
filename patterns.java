public class patterns{
    public static void main(String[] args) {
        // Pattern-1
        // Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

        // For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // * * *
        // * * *
        // * * *


        // solution:
        int n=3;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }


        // Pattern -2 
        // Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

        // An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.

        // For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.

        // Example:
        // Input:  ‘N’ = 3

        // Output: 
        // * 
        // * *
        // * * *


        // solution---------
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i){
                    System.out.print("* ");
                }
            }
                    System.out.println();
        }
            
        

        //Pattern-3
        // Sam is making a Triangular painting for a maths project.

        // An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

        // For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // 1
        // 1 2 
        // 1 2 3

        // solution:--------------
        for(int i=0;i<n;i++){
            int k=1;
           for(int j=0;j<n;j++){
               if(j<=i){
                   System.out.print(k+" ");
                   k++;
               }
           }
                   System.out.println();
       }

        // Pattern-4
        // Sam is making a Triangular painting for a maths project.

        // An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.

        // For every value of ‘N’, help sam to print the corresponding Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // 1
        // 2 2 
        // 3 3 3
        // solution:-----------------------------------
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(j<=i){
                   System.out.print(k+" ");
               }
            }
            k++;
            System.out.println();
       }



        // Pattern-5
        // Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

        // For every value of ‘N’, print the field if the trees are represented by ‘*’.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // * * *
        // * *
        // *

        // solution:-----------------------
        for(int i=0;i<n;i++){
            // int k=1;
           for(int j=0;j<n;j++){
               if(j>=i){
                   System.out.print("* ");
                // k++;
               }
           }
            System.out.println();
       }

        //  Pattern-6
        // Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // 1 2 3
        // 1 2
        // 1


        // solution:--------------------
        for(int i=0;i<n;i++){
             k=1;
           for(int j=0;j<n;j++){
               if(j>=i){
                   System.out.print(k+" ");
                   k++;
               }
           }
                   System.out.println();
       }



        // Pattern-7
        // Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        //   *
        //  ***
        // *****

        int stars=0,spaces=0;
        spaces=2*n-2;
        stars=1;
        for(int i=0;i<n;i++){
            //half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
            //next stars
            for(int l=0;l<stars;l++){
                System.out.print("*");
            }
            //second half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
                System.out.println();
            spaces-=2;
            stars=stars+2;

        }

        // Pattern-8
        // Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // *****
        //  ***
        //   *


        // solution---------------------------
         stars=0;spaces=0;
        spaces=0;
        stars=2*n-1;
        for(int i=0;i<n;i++){
            //half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
            //next stars
            for(int k=0;k<stars;k++){
                System.out.print("*");
            }
            //second half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
                System.out.println();
            spaces+=2;
            stars=stars-2;

        }

        // Pattern-9
        // Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        //   *
        //  ***
        // *****
        // *****
        //  ***
        //   *


        //solution---------------
         stars=0;spaces=0;
        spaces=2*n-2;
        stars=1;
        for(int i=0;i<n;i++){
            //half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
            //next stars
            for(int m=0;m<stars;m++){
                System.out.print("*");
            }
            //second half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
                System.out.println();
            spaces-=2;
            stars=stars+2;

        }
        spaces=0;
        stars=2*n-1;
        for(int i=0;i<n;i++){
            //half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
            //next stars
            for(int m=0;m<stars;m++){
                System.out.print("*");
            }
            //second half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
                System.out.println();
            spaces+=2;
            stars=stars-2;

        }
        // Pattern-10

        // Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // *
        // **
        // ***
        // **
        // *


        // solution:----------------------------------
        for(int i=0;i<n;i++){
             stars=i+1;
             spaces=n-stars;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
                System.out.println();
            

        }
        for(int i=0;i<n-1;i++){
             spaces=i+1;
             stars=n-spaces;
             for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
                System.out.println();

        }

        // Pattern-11
        // Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

        // You are required to print the pattern as shown in the examples below.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // 1
        // 0 1
        // 1 0 1


        // solution:------------------------------------
        boolean check=true;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                check=false;
            }
            else{
                check=true;
            }
            for(int j=0;j<n;j++){
                if(i>=j){
                    if(check){
                        System.out.print(1+" ");

                    }
                    else{
                        System.out.print(0+" ");

                    }
                    check=!check;
                }
            }
            System.out.println();

        }
        // Pattern-12
        // Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

        // Given 'N', print the corresponding pattern.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // 1         1
        // 1 2     2 1
        // 1 2 3 3 2 1


        // solution:-----------------------
        for(int i=0;i<n;i++){
             stars=(i+1)*2;
             spaces=2*n-stars;
            for(int j=1;j<=stars/2;j++){
                System.out.print(j+" ");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=stars/2;j>=1;j--){
                System.out.print(j+" ");
            }
 
                System.out.println();
            
        }
        // Pattern-13
        // Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Number Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // 1
        // 2 3
        // 4 5 6

        // solution:-------------------------------------
         k=1;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(j<=i){
                   System.out.print(k+" ");
                   k++;
               }
           }
                   System.out.println();
       }


        //  Pattern-14
        // Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // A
        // A B
        // A B C

        // solution:--------------------------
        for(int i=0;i<n;i++){
            int val=65;
            for(int j=0;j<n;j++){
                if(i>=j){
                    System.out.print((char)val+++" ");
                }
            }
            System.out.println();
        }

        // Pattern-15
        // Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

        // You must print a matrix corresponding to the given Reverse Letter Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 

        // A B C
        // A B
        // A

        // solution:--------------------------------------------------------
        for(int i=0;i<n;i++){
            int val=65;
            for(int j=0;j<n;j++){
                if(i<=j){
                    System.out.print((char)val+++" ");
                }
            }
            System.out.println();
        }   

        // Pattern-16
        // Sam is curious about Alpha-Ramp, so he decided to create Alpha-Ramp of different sizes.

        // An Alpha-Ramp is represented by a triangle, where alphabets are filled from the top in order.

        // For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // A
        // B B
        // C C C

        // solution:-----------------------------------
        int val=65;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i>=j){
                   System.out.print((char)val+" ");
               }
           }
           val++;
           System.out.println();
       }

        // Pattern-17
        // Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of different sizes.

        // An Alpha-hill is represented by a triangle, where alphabets are filled in palindromic order.

        // For every value of ‘N’, help sam to return the corresponding Alpha-Hill.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        //     A
        //   A B A
        // A B C B A

        // solution:----------------------------------------
        stars=0;spaces=0;
        spaces=2*n-2;
        stars=1;
        for(int i=0;i<n;i++){
            val=65;
            //half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
            //next stars
            for(int p=1;p<=stars;p++){
                if(Math.ceil(stars/2)<p){
                System.out.print((char)val+" ");
                val--;
                }else{
                System.out.print((char)val+" ");
                val++;   
                }

            }
            //second half spaces
            for(int j=0;j<spaces/2;j++){
                System.out.print(" ");
            }
                System.out.println();
            spaces-=2;
            stars=stars+2;

        }


        // Pattern-18
        // Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.

        // An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.

        // For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // C
        // C B 
        // C B A


        // solution:--------------------------------
        for(int i=0;i<n;i++){
            int v=65+n-1;
            for(int j=0;j<n;j++){
               if(j<=i){
                   System.out.print((char)v+" ");
                   v--;
               }
            }
            System.out.println();
       }


        // Pattern-19
        // Sam is curious about symmetric patterns, so he decided to create one.

        // For every value of ‘N’, return the symmetry as shown in the example.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // * * * * * * 
        // * *     * * 
        // *         * 
        // *         * 
        // * *     * * 
        // * * * * * *

        // solution:----------------------------
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
            }
           for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }System.out.println();
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            for(int j=0;j<(2*n-2*i);j++){
                System.out.print("  ");
            }
           for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }System.out.println();
        }


        // Pattern-20
        // Sam is curious about symmetric patterns, so he decided to create one.

        // For every value of ‘N’, return the symmetry as shown in the example.

        // Example:
        // Input: ‘N’ = 3

        // Output: 
        // *         *
        // * *     * *
        // * * * * * *
        // * *     * *
        // *         *

        // solution:----------------------------
        for(int i=0;i<n;i++){
             stars=(i+1)*2;
             spaces=2*n-stars;
            for(int j=1;j<=stars/2;j++){
                System.out.print("* ");
            }
            for(int j=0;j<spaces;j++){
                System.out.print("  ");
            }
            for(int j=stars/2;j>=1;j--){
                System.out.print("* ");
            }
 
                System.out.println();
            
        }
        for(int i=0;i<n-1;i++){
             spaces=(i+1)*2;
             stars=2*n-spaces;
            for(int j=1;j<=stars/2;j++){
                System.out.print("* ");
            }
            for(int j=0;j<spaces;j++){
                System.out.print("  ");
            }
            for(int j=stars/2;j>=1;j--){
                System.out.print("* ");
            }
 
                System.out.println();
            
        }


        // Pattern-21
        // Ninja has been given a task to print the required star pattern and he asked your help for the same.

        // You must return an ‘N’*’N’ matrix corresponding to the given star pattern.

        // Example:
        // Input: ‘N’ = 4

        // Output: 

        // ****
        // *  *
        // *  *
        // ****

        // solution:------------------------------
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
                    System.out.println();

        }


        // Pattern-22   
        // Ninja has been given a task to print the required pattern and he asked for your help with the same.

        // You must print a matrix corresponding to the given number pattern.

        // Example:
        // Input: ‘N’ = 4

        // Output: 

        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444


        // solution:------------------------------------------------
        int [][]arr=new int [2*n-1][2*n-1];
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                    arr[i][j]=Math.min(Math.min(i,j),Math.min((2 * n - 2 - j), (2 * n - 2 - i)));
            }
        }
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                    arr[i][j]=n-arr[i][j];
                    System.out.print(arr[i][j]);
            }
            System.out.println();

        }



    }


}




