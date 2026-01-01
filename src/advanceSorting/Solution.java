package advanceSorting;

import java.util.*;

public class Solution {
    public static List<Integer> getResources(int inc, int dec, List<Integer> performance) {
        int n = performance.size();

        // Step 1: Create a sorted list of unique performance values
        List<Integer> sortedPerformance = new ArrayList<>(new HashSet<>(performance));
        Collections.sort(sortedPerformance, Collections.reverseOrder());

        // Step 2: Assign ranks using a Map
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedPerformance.size(); i++) {
            rankMap.put(sortedPerformance.get(i), i + 1); // Rank starts from 1
        }

        // Step 3: Compute rank for each server and track frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> rank = new ArrayList<>();

        for (int perf : performance) {
            int r = rankMap.get(perf);
            rank.add(r);
            freqMap.put(r, freqMap.getOrDefault(r, 0) + 1);
        }

        // Step 4: Compute resource allocation
        List<Integer> resources = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int countSameRank = freqMap.get(rank.get(i));
            int allocated = (inc * (n + 1 - rank.get(i))) - (dec * countSameRank);
            resources.add(allocated);
        }

        return resources;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inc = scanner.nextInt();
        int dec = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer> performance = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            performance.add(scanner.nextInt());
        }

        List<Integer> result = getResources(inc, dec, performance);

        for (int res : result) {
            System.out.println(res);
        }

        scanner.close();
    }
}
