
public class Vector {
	private int x, y, z;

	public Vector(Point3D p1, Point3D p2) {
		this.x = p2.getX() - p1.getX();
		this.y = p2.getY() - p1.getY();
		this.z = p2.getZ() - p1.getZ();
	}

	public Vector(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector vectorProduct(Vector o) {
		Vector vector = new Vector(0, 0, 0);
		vector.x = this.y * o.z - this.z * o.y;
		vector.y = this.z * o.x - this.x * o.z;
		vector.z = this.x * o.y - this.y * o.x;
		return vector;
	}

	public double dotProduct(Vector o) {
		return this.x * o.x + this.y * o.y + this.z * o.z;
	}
}
