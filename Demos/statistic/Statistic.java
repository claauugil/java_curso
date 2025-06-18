package Demos.statistic;

public class Statistic {
    
    static int sumAllArray(int[] data){

        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum;
    }

    static double averageArray(int[] data){

        double average = sumAllArray(data) / data.length;
        return average;
    }

    static double average(int ...args){
        return (averageArray(args));
    }
    public static void main(String[] args) {
        
        int[] data = {1, 2 ,3,4,5,6,7, 10, 12, 5, 3, 1,8};
        double avgArray = averageArray(data);
        System.out.println("La media del array es: " + avgArray);
        double avg = average(1, 2 ,3,4,5,6,7, 10, 12, 5, 3, 1,8);
        System.out.println("La media del array es: " + avg);
    }
}
