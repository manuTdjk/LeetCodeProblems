import java.util.*;

class RandomizedSet {
    private List<Integer> values;
    private Map<Integer, Integer> indexMap;
    private Random rand;

    public RandomizedSet() {
        values = new ArrayList<>();
        indexMap = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }
        values.add(val); // Add value to the end of the list
        indexMap.put(val, values.size() - 1); // Map the value to its index
        return true;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }
        // Get index of the value to be removed
        int index = indexMap.get(val);
        // Swap with the last element
        int lastVal = values.get(values.size() - 1);
        values.set(index, lastVal);
        indexMap.put(lastVal, index);
        // Remove last element
        values.remove(values.size() - 1);
        indexMap.remove(val);
        return true;
    }

    public int getRandom() {
        return values.get(rand.nextInt(values.size()));
    }
}

/**
 * Example Usage:
 * RandomizedSet randomizedSet = new RandomizedSet();
 * boolean param1 = randomizedSet.insert(1);
 * boolean param2 = randomizedSet.remove(2);
 * int param3 = randomizedSet.getRandom();
 */
