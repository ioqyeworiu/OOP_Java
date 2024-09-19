
public class Point3D {
	private int x, y, z;

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	
	public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
		Vector vector1 = new Vector(p1, p2);
		Vector vector2 = new Vector(p1, p3);
		Vector vector3 = new Vector(p1, p4);
		if((vector1.vectorProduct(vector2)).dotProduct(vector3)==0) {
			return true;
		}
		return false;
	}
}
