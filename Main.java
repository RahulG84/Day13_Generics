public class Main {
    public static void main(String[] args) {

        System.out.println("Maximum Float : ");
        MaximumData test2 = new MaximumData();
        Float[] inputArray = {1f,2f,3f};
        test2.maxElement(inputArray);
        Float[] inputArray1 = {1f,3f,2f};
        test2.maxElement(inputArray1);
        Float[] inputArray2 = {3f,2f,1f};
        test2.maxElement(inputArray2);
    }
}
