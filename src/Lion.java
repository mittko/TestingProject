public class Lion extends Cat {
    public String color = "yellow";
    public float weight = 200f;

    @Override
    public String toString() {
        return super.toString() + " " + "Lion{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
