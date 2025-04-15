class setZeros {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> columnZero=new HashSet<>();
        Set<Integer> rowZero=new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rowZero.add(i);
                    columnZero.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            if(rowZero.contains(i))Arrays.fill(matrix[i],0);
            for(int j=0;j<matrix[i].length;j++){
                if(columnZero.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
