import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int item : tangerine) {
            hash.put(item, hash.getOrDefault(item, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        hash.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(entry-> {
            for (int i = 0; i < entry.getValue(); i++) {
                list.add(entry.getKey());
            }
        });

        answer = (int) list.subList(0, k).stream().distinct().count();

        return answer;
    }
}