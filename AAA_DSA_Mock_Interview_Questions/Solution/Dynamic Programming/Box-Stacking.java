import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Box
{
    int length, width, height;
 
    private Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
 
    public static Box of(int a, int b, int c) {
        return new Box(a, b, c);
    }
}
 
class Main
{
    public static List<Box> createAllRotations(List<Box> boxes)
    {
        List<Box> rotations = new ArrayList<>();
 
        for (Box box: boxes)
        {
            rotations.add(box);
 
            rotations.add(Box.of(Math.max(box.length, box.height),Math.min(box.length, box.height),box.width));
            rotations.add(Box.of(Math.max(box.width, box.height),Math.min(box.width, box.height),box.length));
        }
 
        return rotations;
    }
 
    public static int findMaxHeight(List<Box> boxes)
    {
        if (boxes == null || boxes.size() == 0) {
            return 0;
        }
        List<Box> rotations = createAllRotations(boxes);
 
        Collections.sort(rotations, (x, y) -> (y.length * y.width -x.length * x.width));
 
        int[] max_height = new int[rotations.size()];
 
        for (int i = 0; i < rotations.size(); i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (rotations.get(i).length < rotations.get(j).length && rotations.get(i).width < rotations.get(j).width) {max_height[i] = Math.max(max_height[i], max_height[j]);
                }
            }
 
            max_height[i] += rotations.get(i).height;
        }
 
        return Arrays.stream(max_height).max().getAsInt();
    }
 
    public static void main(String[] args)
    {
        List<Box> boxes = Arrays.asList(Box.of(4, 2, 5), Box.of(3, 1, 6),Box.of(3, 2, 1), Box.of(6, 3, 8));
 
        System.out.println("The maximum height is " + findMaxHeight(boxes));
    }
}