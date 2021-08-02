import java.util.ArrayList;
public class TestBasicJava {
    public static void main(String[] args) {
        
        BasicJava tester = new BasicJava();

        //tester.countTo255();
        //tester.oddTo255();
        //tester.sigmaTo255();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        //[1,3,5,7,9,13]
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(13);
        tester.iterateArray(list);
        tester.findMax(list);

        //System.out.println(tester.arrayWithOdds());
    }
}
