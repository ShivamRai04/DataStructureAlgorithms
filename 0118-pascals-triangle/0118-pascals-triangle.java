class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows ==0)
          return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1));
       
        if(numRows==1)
           return list;
        
        list.add(Arrays.asList(1,1));
        List<Integer> prevRow = list.get(1);  

        for(int i=3; i<=numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j=1; j<prevRow.size();j++) {
              row.add(prevRow.get(j) + prevRow.get(j-1));
            }

            row.add(1);
            list.add(row);
            prevRow = row;  
        }

        return list; 
    }
}