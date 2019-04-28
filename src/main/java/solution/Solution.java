package solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> pair  = agrupar(ar);
        return  quantidadePares(pair);
    }

    private static Integer quantidadePares(Map<Integer, Integer> pairs) {
        Integer quantidadePares = 0;

        for (Map.Entry<Integer, Integer> pair : pairs.entrySet()) {
            quantidadePares = quantidadePares + (pair.getValue() / 2);
        }
        return quantidadePares;
    }

    static Map<Integer, Integer> agrupar(int[] ar) {
        Map<Integer, Integer> pair = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            Integer count = pair.containsKey(ar[i]) ? pair.get(ar[i]) : 0;
            pair.put(ar[i], ++count);
        }
        return pair;
    }

}
