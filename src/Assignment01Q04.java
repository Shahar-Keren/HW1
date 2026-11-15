import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0)
            return array;
        if (move % array.length == 0)
            return array;
        int[] helper = new int[array.length];
        for (int i = 0; i < array.length; i++)
            helper[i] = array[i];

        if((direction == 'R' && move > 0) || (direction == 'L' && move < 0))
            return moveRight(array, Math.abs(move), helper);
        else if ((direction == 'L' && move > 0) || (direction == 'R' && move < 0)) 
            return moveLeft(array, Math.abs(move), helper);       
        return array;
    }

    public static int[] moveLeft(int[] array, int move, int[] helper){
        int remainder = move % array.length;
        for (int i = 0; i < array.length; i++)
            array[i] = helper[(i + remainder) % array.length];
        return array;
    }
    public static int[] moveRight(int[] array, int move, int[] helper){
        int remainder = move % array.length;
        for (int i = 0; i < array.length; i++)
            array[i] = helper[(array.length + i - remainder) % array.length];
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}