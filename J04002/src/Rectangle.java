
public class Rectangle {
	private int width, height;
	private String color;

	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color.substring(1, 2).toUpperCase() + color.substring(2).toLowerCase();
	}

	public boolean isRect() {
		return this.height > 0 && this.width > 0;
	}

	public long perimeter() {
		return (this.height + this.width) * 2;
	}

	public long area() {
		return this.height * this.width;
	}

	public String getColor() {
		return this.color;
	}
}
