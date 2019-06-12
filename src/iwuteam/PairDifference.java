package iwuteam;

import java.util.HashSet;
import java.util.List;

/**
 *     Дан неупорядоченный массив целых чисел  arr и целое число k
 *     Реализуйте функцию, которое возвращает число - количество уникальных
 *     пар, разность значений которых равна k.
 *
 *     Пример:
 *
 *         arr = [1, 5, 3, 4, 2, 2]; k = 3
 *         Уникальные пары с разностью 3: [1, 4], [5, 2]
 *         Итого, количество пар: 2
 *
 *     Ограничения:
 *
 *         0 <= k <= 1000000
 *         0 <= arr[i] <= 1000000
 */
public class PairDifference {

    /**
     * @param arr список целых чисел
     * @param k разность значений чисел
     * @return количество уникальных пар с заданной разностью
     */
    public static int pairdiffcount(List<Integer> arr, int k) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && !set.contains(arr.get(i) +":"+ arr.get(j))) {
                    if (Math.abs(arr.get(i) - arr.get(j)) == k) {
                        set.add(arr.get(j) +":"+ arr.get(i));
                    }
                }
            }
        }
        return set.size();
    }
}
