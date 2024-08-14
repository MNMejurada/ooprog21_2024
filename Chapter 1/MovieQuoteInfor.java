
class OppenheimerQuotes {
    String quote;

    void quote1() {
        quote = "Now I Am Become Death, the Destroyer of Worlds. -Oppenheimer";

        System.out.println(quote);    
    }

    void quote2() {
        quote = "They won't fear it until they understand it, and they won't understand it until they've used it. -Oppenheimer";

        System.out.println(quote);
    }
}

public class MovieQuoteInfor{
    public static void main(String args[]) {

        OppenheimerQuotes opquotes = new OppenheimerQuotes();

        opquotes.quote1();
        opquotes.quote2();

    }
}