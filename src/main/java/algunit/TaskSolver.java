package algunit;

import java.util.LinkedList;

public class TaskSolver {
    // сдвиг элементов массива на k влево
    // средняя сложность с доп массивом
    // макс сложность - без доп массива

    public static int[] moveArrayLeftOnK(int[]array, int k) {
        return null;
    }


    // задача Кадане
    //Напиши функцию, которая находит максимальной сумму последовательных элементов.
    //Пример:
    //Для массива [-2, 1, -3, 4, -1, 2, 1, -5, 4] результатом будет [4, -1, 2, 1] сумма = 6.
    public static int kadaneArray(int[] array){
        int sum = array[0];
        int maxSum = sum;
        for(int i = 1; i < array.length; i++){
            if (sum + array[i] > sum){
                sum += array[i];
            } else {
                if (maxSum < sum)       {
                   maxSum = sum;
                } else {
                    if(array[i-1] + array[i] > array[i]){
                        sum = array[i-1] + array[i];
                    }
                    else {sum = array[i];}
                }


            }


        }
        return maxSum;



    };

    public static int findMaxSubarraySum(int[] nums) {
        var link = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null.");
        }

        int currentMax = nums[0]; // Текущая максимальная сумма
        int globalMax = nums[0];  // Глобальная максимальная сумма

        for (int i = 1; i < nums.length; i++) {
            // Обновляем текущую максимальную сумму
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Обновляем глобальную максимальную сумму
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }


    ///2. Число с максимальной частотой
    //Задача:
    //Найди элемент, который встречается в массиве наибольшее количество раз.
    //
    //Пример:
    //
    //Вход: [1, 3, 3, 4, 5, 3, 6] → Выход: 3
    //Вход: [10, 20, 10, 30, 20, 10] → Выход: 10

    public static int findMaxCount(int[] array){

//        HashMap<Integer, Integer> map = new HashMap<>();
//        Arrays.stream(array).forEach(value -> map.getOrDefault(value));
        return 1;
    }
}
