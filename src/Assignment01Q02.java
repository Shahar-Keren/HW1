public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int curr_fracture = 1;
        int counter = Integer.parseInt(args[0]);
        for (int i = 0; i < counter; i++) {
            if (i % 2  == 0)
                approxPi += (1.0 / curr_fracture);
            else
                approxPi -= (1.0 / curr_fracture);
            curr_fracture += 2;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
