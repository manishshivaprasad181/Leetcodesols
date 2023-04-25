class findDisappearedNumbers{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            hm.put(i,0);
        }
        for(int i=0;i<n;i++)
        {
            
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==0)
            l.add(entry.getKey());
        }
        return l;
    }
}