import java.util.Stack;

public class DayNgoac {
	private String value;

	public DayNgoac(String value) {
		this.value = value;
	}

	public boolean isTrueString() {
		Stack<String> st = new Stack<String>();
		for (int i = 0; i < value.length(); i++) {
			String temp = value.charAt(i) + "";
			if (temp.equals("(") || temp.equals("[") || temp.equals("{")) {
				st.push(temp);
			} else if (!st.isEmpty()) {
				if (st.peek().equals("(") && temp.equals(")")) {
					st.pop();
				} else if (st.peek().equals("[") && temp.equals("]")) {
					st.pop();
				} else if (st.peek().equals("{") && temp.equals("}")) {
					st.pop();
				}
			}
		}
		if (st.isEmpty()) {
			return true;
		}
		return false;
	}
}
