class RandomizedSet {
    
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();
    
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        } 
        else{
            set.add(val);
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            val = list.indexOf(val);
            list.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int rand = -1;
        int range = list.size();
        for (int i = 0; i < list.size(); i++) {
            rand = (int)(Math.random() * range);
        }
        return list.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */