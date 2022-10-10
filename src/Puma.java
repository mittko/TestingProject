public class Puma extends Cat {
    public String color = "black";
    public float weight = 120f;
    public String sex = "female";

    @Override
    public String toString() {
        return "Puma{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
