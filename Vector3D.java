

public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        return String.format("(%,.2f, %,.2f, %,.2f)", x, y, z);
    }

    public double getMagnitude() {
        double magnitude =  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return magnitude;
    }

    public Vector3D normalize() {
        double normalized =
    }

}
