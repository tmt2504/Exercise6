/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeat;

/**
 *
 * @author tmt25
 */
public class Repeat {

    public static String checkRepeat(String string) {
        string = string.toLowerCase();
        String word[] = string.split(" ");
        String sentence = "";
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    word[j] = "REPEAT";
                    word[i] = "";
                     
                }
            }
            sentence = sentence + word[i]+" ";
        }
        return sentence;
    }

}
