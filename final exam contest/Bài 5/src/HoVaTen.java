public class HoVaTen {
    private String value;

    public HoVaTen(String valString) {
        value = valString;
    }

    public void format() {
        String[] str = value.split("\\s+");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase();
        }
        value = String.join(" ", str).trim();
    }

    public String convert1() {
        String[] str = value.split(" ");
        String[] temp = new String[str.length - 1];
        System.arraycopy(str, 0, temp, 0, str.length - 1);
        return str[str.length - 1] + " " + String.join(" ", temp);
    }

    public String convert2() {
        String[] str = value.split(" ");
        String[] temp = new String[str.length - 1];
        System.arraycopy(str, 1, temp, 0, str.length - 1);
        return String.join(" ", temp) + " " + str[0];
    }
}
