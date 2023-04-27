package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    String str;

    public ReversedSequence(String str) {
        this.str = new StringBuilder(str).reverse().toString();;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String substr = str.substring(start, end);
        return new ReversedSequence(substr);
    }

    @Override
    public String toString() {
        return str;
    }
}
// END
