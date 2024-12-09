import java.util.ArrayList;

public class XauKiTu {
    private String value;

    public XauKiTu(String value) {
        this.value = value;
    }

    public String solve() {
        int sum = 0;
        ArrayList<Character> str = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            Character c = value.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                str.add(c);
            }
        }
        str.sort((o1, o2) -> o1.compareTo(o2));
        String result = "";
        for (Character c : str) {
            result += c;
        }
        return result + sum;
    }

}
