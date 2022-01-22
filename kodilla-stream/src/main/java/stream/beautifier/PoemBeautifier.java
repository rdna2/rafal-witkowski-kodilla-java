package stream.beautifier;

public class PoemBeautifier {
    public void beautify(String words, String decoration, PoemDecorator text) {

        String result = text.decorate(words, decoration);
        System.out.println("Poetry in motion: " + result);
    }
    public void upper(String words, String decoration, PoemDecorator text) {
            String result1 = text.decorate(words.toUpperCase(),decoration.toUpperCase());
            System.out.println("Poetry in motion: " + result1);
        }

    public void subsequence(String words, String decoration, PoemDecorator text) {
        String result2 = text.decorate(words.substring(10, 17), decoration);
        System.out.println("Poetry in motion: " + result2);
    }

    public void replaceAll(String words, String decoration, PoemDecorator text) {
        String result3 = text.decorate(words.replaceAll("Evening", "morning"), decoration.replaceAll("Evening","Morning"));
        System.out.println("Poetry in motion: " + result3);
    }
    public static String replaceAll1(String words, String decoration) {
        return words.replaceAll("Evening", "morning") + decoration.replaceAll("Evening","Morning");

    }

    }

