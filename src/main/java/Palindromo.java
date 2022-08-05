import java.text.Normalizer;

public class Palindromo {
  public static void main(String[] args) {
    Palindromo p = new Palindromo();
    System.out.println(p.palindrome("Dábale arroz a la zorra el abad"));
  }

  public boolean palindrome(String text) {
    text = text.toLowerCase();
    text = text.replaceAll("\\s*", "");
    text = Normalizer.normalize(text, Normalizer.Form.NFD);
    text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    boolean result;
    Palindromo p = new Palindromo();
    char[] chr = p.toCharArray(text);
    char[] revert = p.toCharArray(text);
    char d;
    int f = text.length() -1;
    for (int i = 0; i < text.length(); i++) {
      d = chr[i];
      chr[i] = revert[f];
      revert[f] = d;
      f--;
    }
    if (text.equals(String.valueOf(revert))) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
  public char[] toCharArray(String string) {
    return string.toCharArray();
  }
}
