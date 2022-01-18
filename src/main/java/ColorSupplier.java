import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];

        return color.toString();
    }
}
