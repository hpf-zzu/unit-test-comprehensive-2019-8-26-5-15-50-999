package tw;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.println(input);

            if(input.length() == 4) {
                int[] answer = {1,2,3,4};

                int[] array = new GuessInputCommand().toArray(input);
                int intAnumber = new GuessInputCommand().getSameAnumber(array, answer);
                int intBnumber = new GuessInputCommand().getSameBnumber(new GuessInputCommand().getSameCount(array, answer),
                        new GuessInputCommand().getSameAnumber(array, answer));
                String output = new GuessInputCommand().printAnswer(intAnumber, intBnumber);
                System.out.println(output);
            }else{
                System.out.println("input four number!");
            }
        }


    }
}
