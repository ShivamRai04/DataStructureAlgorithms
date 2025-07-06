class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows ==0)
          return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1));
    
        if(numRows>=2)
          list.add(Arrays.asList(1,1));

        if(numRows <=2)
          return list;
        
        System.out.println(list);
        List<Integer> prevRow = list.get(1);   
        int i=3;
        System.out.println("Before while loop");
        while(i<=numRows) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int j=1;
            while(j<prevRow.size()){
                row.add(prevRow.get(j) + prevRow.get(j-1));
                j++;
            }
            row.add(1);
           list.add(row);
           prevRow = row;
           i++;
        }
        
        return list;
    }
}