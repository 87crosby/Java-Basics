public class FizzBuzz {
    public String fizzBuzz(int num){
        if(num % 3 == 0){
            return "Fizz";
        }else if(num % 5 == 0){
            return "Buzz";
        }else if(num % 15 == 0){
            return "FizzBuzz";
        }else{
            String answer = String.valueOf(num);
            return answer;
        }
    }
}
