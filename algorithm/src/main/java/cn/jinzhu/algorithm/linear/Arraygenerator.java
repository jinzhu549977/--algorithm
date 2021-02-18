package cn.jinzhu.algorithm.linear;

public class Arraygenerator {
    private  Arraygenerator(){}
    public  static Integer[] generatorOrder(int n){
        Integer[] integer = new Integer[n];
        for (int i = 0; i <  n;i++){
            integer[i] = i;
        }
            return integer;
    }
}
