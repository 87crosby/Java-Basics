public class TestPuzzle{
    public static void main(String[] args) {
        Puzzle dice = new Puzzle();
        System.out.println(dice.getTenRolls());
        System.out.println(dice.getRandomLetter());
        System.out.println(dice.generatePassword());
        System.out.println(dice.getNewPasswordSet(5));
    }
}