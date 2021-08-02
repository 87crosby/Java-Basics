import java.util.Random;
import java.util.ArrayList;

public class Puzzle {
    public ArrayList<Integer> getTenRolls(){
        Random dice = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int x = dice.nextInt(20) + 1;
            list.add(x);
        }
        return list;
    }

    public char getRandomLetter(){
        Random num = new Random();
        char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int x = num.nextInt(25);
        return letter[x];
    }

    public String generatePassword(){
        Random num = new Random();
        StringBuilder sb = new StringBuilder();
        char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String str;
        for(int i = 0; i < 8; i++){
            int x = num.nextInt(25);
            sb.append(letter[x]);
        }
        str = sb.toString();
        return str;
    }

    public ArrayList<Object> getNewPasswordSet(int length){
        ArrayList<Object> list = new ArrayList<Object>();
        int i = 0;
        while(i<length){
            list.add(generatePassword());
            i++;
        }
        return list;
    }
}
