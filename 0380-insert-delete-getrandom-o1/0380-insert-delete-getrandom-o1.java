import java.util.*;

class RandomizedSet {

    private List<Integer> list = new ArrayList<>();
    private Map<Integer, Integer> map = new HashMap<>();
    private Random random = new Random();

    public RandomizedSet() {}
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int removeIdx = map.get(val);
        int lastIdx = list.size()-1;
        int lastVal = list.get(lastIdx);

        list.set(removeIdx, lastVal);
        map.put(lastVal, removeIdx);
        
        list.remove(lastIdx);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */