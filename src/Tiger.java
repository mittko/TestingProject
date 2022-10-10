public class Tiger extends Cat {

    public String color = "orange";
    public float weight = 220f;
    public String sex = "male";

    @Override
    public String toString() {
        return "Tiger{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
