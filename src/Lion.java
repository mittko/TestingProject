public class Lion extends Cat {
    public String color = "yellow";

    @Override
    public String toString() {
        return super.toString() + " " + "Lion{" +
                "color='" + color + '\'' +
                '}';
    }
}
