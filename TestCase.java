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
public class TestCase {

    public void test() {
        String s1 = "i want to to go home";
        String s2 = "i need to to go home home";
        String s3 = "go back back home";
        String s4 = "finish finish class";
        String s5 = "i want to to go to the the zoo";
        System.out.println("Case 1: " + s1);
        System.out.println("Expect output: i want REPEAT go home");
        System.out.println("Real output: " + Repeat.checkRepeat(s1));
        System.out.println("\n");
        System.out.println("Case 2: " + s2);
        System.out.println("Expect output: i need REPEAT go REPEAT");
        System.out.println("Real output: " + Repeat.checkRepeat(s2));
        System.out.println("\n");
        System.out.println("Case 3: " + s3);
        System.out.println("Expect output: go REPEAT home");
        System.out.println("Real output: " + Repeat.checkRepeat(s3));
        System.out.println("\n");
        System.out.println("Case 4: " + s4);
        System.out.println("Expect output: REPEAT class");
        System.out.println("Real output: " + Repeat.checkRepeat(s4));
        System.out.println("\n");
        System.out.println("Case 5: " + s5);
        System.out.println("Expect output: i want REPEAT go to REPEAT zoo");
        System.out.println("Real output: " + Repeat.checkRepeat(s5));
    }
}
