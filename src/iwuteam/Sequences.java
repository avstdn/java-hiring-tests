package iwuteam;

import java.util.ArrayList;
import java.util.List;

/**
 *     Реализовать функцию, которая возвращает массив строк с
 *     целочисленными значениями, попеременно возрастающими и убывающими от 1 до N.
 *
 *     Например, результат при N=4:
 *
 *         [
 *             '1',
 *             '2-1',
 *             '1-2-3',
 *             '4-3-2-1',
 *         ]
 *
 *     Допустимые значения N:
 *
 *         0 < N < 1000000;
 *
 *     Постарайтесь написать короткое и читаемое решение.
 */
public class Sequences {

    /**
     *
     * @param n количество строк
     * @return список строк, в формате, указанном в примере
     */
    public static List<String> sequences(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder subList = new StringBuilder();
            if (i % 2 == 1) {
                for (int j = i + 1; j > 0; j--) {
                    if (subList.length() == 0) subList.append(j);
                    else subList.append("-").append(j);
                }
            } else {
                for (int k = 1; k <= i + 1; k++) {
                    if (subList.length() == 0) subList.append(k);
                    else subList.append("-").append(k);
                }
            }
            list.add(subList.toString());
        }
        return list;
    }
}
