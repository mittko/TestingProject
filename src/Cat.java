public abstract class Cat {
    public int legs = 4;
    public String food = "meat";
    public String type = "predator";

    @Override
    public String toString() {
        return "Cat{" +
                "legs=" + legs +
                ", food='" + food + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
