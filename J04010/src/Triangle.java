
public class Triangle {
	private Point p1, p2, p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public boolean isTriangle() {
		if (p1.distance(p2) + p2.distance(p3) <= p1.distance(p3)) {
			return false;
		} else if (p2.distance(p3) + p3.distance(p1) <= p1.distance(p2)) {
			return false;
		} else if (p1.distance(p2) + p1.distance(p3) <= p2.distance(p3)) {
			return false;
		}
		return true;
	}

	public double perimeter() {
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
	}

	public double area() {
		return Math.sqrt(0.5 * this.perimeter() * (0.5 * this.perimeter() - p1.distance(p2))
				* (0.5 * this.perimeter() - p2.distance(p3)) * (0.5 * this.perimeter() - p1.distance(p3)));
	}

	public double radius() {
		return 0.25 * p1.distance(p2) * p2.distance(p3) * p3.distance(p1) / this.area();
	}

	public double cirCircle() {
		return Math.PI * Math.pow(this.radius(), 2);
	}

	@Override
	public String toString() {
		return String.format("%.3f", this.cirCircle());
	}
}
