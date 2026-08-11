class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> reuslt = new ArrayList<>();
            int n = matrix.length;
            int m = matrix[0].length;
         int startR = 0;
         int EndR = n-1;
         int endC = m-1;
         int StartC = 0;
        while(startR<=EndR && StartC <= endC){
            //start
            for(int j = StartC ; j<= endC;j++){
                reuslt.add(matrix[startR][j]);
            }
    startR+=1;
    //end column
    for(int i = startR ; i<= EndR;i++){
                reuslt.add(matrix[i][endC]);
            }
    endC-=1;

    if(startR<=EndR){
  //last row 
    for(int j = endC ; j>= StartC;j--){  
                reuslt.add(matrix[EndR][j]);
            }
    }


    EndR-=1;
    if(StartC <= endC){
    //first column
    for(int i = EndR ; i>= startR;i--){
                reuslt.add(matrix[i][StartC]);
            }
            StartC+=1;
    }
    
        }
        return reuslt;
        }
    }
