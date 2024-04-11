package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        char whitespace =' ';int i = 0;
        while ( i < chars.length)
        {
            while (chars[i] != whitespace) {
                System.out.print(chars[i++]);

            }

            i++;
            System.out.print(whitespace);
        }


    }
}
