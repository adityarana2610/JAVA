import java.util.Scanner;

public class Jump {
    String word;
    int len;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        word = sc.next();
        len = word.length();
    }

    void display() {
        System.out.println(word.trim());
    }

    Jump move(Jump P, Jump Q) {
        Jump Moved = new Jump();
        String shorter = "";
        String longer = "";
        if (P.len > Q.len) {
            shorter = Q.word;
            longer = P.word;
        } else {
            shorter = P.word;
            longer = Q.word;
        }
        int i = 0;
        Moved.word = " ";
        while (shorter.length() > i) {
            Moved.word = Moved.word + longer.substring(0, i) + shorter.substring(0, i);
            shorter = shorter.substring(i);
            longer = longer.substring(i);
            i++;
        }
        Moved.word += longer.substring(0, shorter.length()) + shorter + longer.substring(shorter.length());
        return Moved;
    }

    public static void main(String[] args) {
        Jump input1 = new Jump();
        Jump input2 = new Jump();
        Jump output = new Jump();
        input1.input();
        input2.input();
        output = output.move(input1, input2);
        output.display();
    }
}