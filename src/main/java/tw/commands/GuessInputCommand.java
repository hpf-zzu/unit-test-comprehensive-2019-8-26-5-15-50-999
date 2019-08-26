package tw.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jxzhong on 2017/5/19.
 */
public class GuessInputCommand {

    private BufferedReader bufferedReader;

    public GuessInputCommand() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() throws IOException {
        System.out.println("------Please input your answer as x x x x , x <10 ------");
        return bufferedReader.readLine();
    }

    public int[] toArray(String input){
        char[] chs = input.toCharArray();
        int[] array = new int[4];
        for(int i = 0; i < chs.length; i ++){
            String str = String.valueOf(chs[i]);
            int temp = Integer.parseInt(str);
            array[i] = temp;
        }
        return array;
    }
    public int getSameCount(int[] array,int[] answer){
        int count = 0;
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < answer.length; j ++){
                if(array[i] == answer[j]){
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
    public int getSameAnumber(int[] array, int[] answer){
        int count = 0;
        for(int i = 0; i < array.length; i ++){
            if(array[i] == answer[i]){
                count ++;
            }
        }
        return count;
    }
    public int getSameBnumber(int count1, int count2){
        int count = 0;
        return count1 - count2;
    }
    public String printAnswer(int A, int B){
        return A +"A" + B +"B";
    }
}
