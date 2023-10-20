public class RandomizedSet {
    private Map<Integer, Integer> keyMap;
    private Map<Integer, Integer> valueMap;
	Random random;
    int count;
    public RandomizedSet() {
        keyMap = new HashMap<>();
        valueMap = new HashMap<>();
		random = new Random();
    }
    public boolean insert(int val) {
        if (keyMap.containsKey(val)) {
            return false;
        } else {
            keyMap.put(val, count);
            valueMap.put(count, val);
            count = keyMap.size();
            return true;
        }
    }
    public boolean remove(int val) {
        if (!keyMap.containsKey(val)) {
            return false;
        } else {
            int valueKey = keyMap.get(val);
            keyMap.remove(val);
            if (valueKey != valueMap.size() - 1) {
                valueMap.put(valueKey, valueMap.get(valueMap.size() - 1));
                keyMap.put(valueMap.get(valueMap.size() - 1), valueKey);
                valueMap.remove(valueMap.size() - 1);
            } else {
                valueMap.remove(valueKey);
            }
            count = keyMap.size();
            return true;
        }
    }
    public int getRandom() {
        return valueMap.get(random.nextInt(keyMap.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */