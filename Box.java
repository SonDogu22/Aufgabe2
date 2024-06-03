import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Box implements Comparable<Box> {
    private String content;
    private Integer weight;

    public Box(String content, Integer weight) {
        this.content = content;
        this.weight = weight;
    }

    @Override
    public int compareTo(Box other) {
        return this.weight.compareTo(other.weight);
    }

    @Override
    public String toString() {
        return "Content: " + content + ", Weight: " + weight;
    }

    
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        Random random = new Random();

        boxes.add(new Box("Item1", random.nextInt(20)));
        boxes.add(new Box("Item2", random.nextInt(20)));
        boxes.add(new Box("Item3", random.nextInt(20)));
        boxes.add(new Box("Item4", random.nextInt(20)));
        boxes.add(new Box("Item5", random.nextInt(20)));

        System.out.println("Original List:");
        for (Box box : boxes) {
            System.out.println(box);
        }

        Collections.sort(boxes);

        System.out.println("\nSorted List:");
        for (Box box : boxes) {
            System.out.println(box);
    }
}


}

