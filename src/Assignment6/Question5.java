package Assignment6;

//5
//Demonstrate the use of repeat(), strip(),trim(),
// isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.
public class Question5 {
    public static void main(String[] args) {
     String str="My name is Aditya";
     String str1="I study in Abes";
     System.out.println(str+" "+str1.repeat(2));
        String whiteTrailString = "\n\t   This is a string with white trails   \u2005";
        System.out.println(whiteTrailString.trim().equals("This is a string with white trails"));
        System.out.println(whiteTrailString.strip().equals("This is a string with white trails"));
        String blackString = "\n\t  ";
        System.out.println(blackString.isBlank());

        String txt = "Hello Guys ! My name is aadi";
        txt = txt.indent(15);
        System.out.println(txt);
        txt = txt.indent(-20);
        System.out.println(txt);

        String str3 = "Hello\\nWorld!";
        System.out.println(str3.translateEscapes());

        String text = """
                Hello,
                  This is a Java 13+ feature!
                Enjoy Coding!   
                """;

        System.out.println(text.stripIndent());
        // triple quotes
        System.out.println(text);

        String name="Aditya";
        int age=21;

        System.out.println("Hey, my name is %s and I am %d years old".formatted(name,age));

    }
}
