import java.util.ArrayList;

public class BasicJava{
    public void countTo255(){
        for(int i=0; i < 256; i++){
            System.out.println(i);
        }
    }

    public void oddTo255(){
        for(int i=0; i < 256; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void sigmaTo255(){
        int sum = 0;
        for(int i=0; i < 256; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public void iterateArray(ArrayList<Integer> myArray){
        for(int i = 0; i < myArray.size(); i++){
            int num = myArray.get(i);
            System.out.println(num);
        }
    }

    public void findMax(ArrayList<Integer> myArray){
        int max = -1000;
        for(int i = 0; i < myArray.size(); i++){
            int num = myArray.get(i);
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }

    public ArrayList<Integer> arrayWithOdds(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < 256; i++){
            if(i % 2 != 0){
                list.add(i);
            }
        }
        return list;
    }
}