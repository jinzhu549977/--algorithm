package cn.jinzhu.algorithm.linear;

import java.util.Objects;

public class LinearSearch{
  /*公用类型泛型 --线性查找法----查找数组中的某个数   输入条件为 数组和目标元素*/
    public static<T> int search(T[] date, T target) {
        for (int i = 0; i < date.length; i++) {
            if (date[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static<T> int search2(T[] date, T target) {
        for (int i = 0; i < date.length; i++) {
            for (int j = i + 1 ; j < date.length; j++) {
                    if(date[i].equals(date[j])){
                        System.out.println((int)date[i]+(int)date[j]);
                        continue;
                    }
            }
        }
        return 0;
    }
    private LinearSearch(){}
}
