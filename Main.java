public class Main {
    public static void main(String[] args) {

        Integer[] i = {56,30,70};
        String[] s = {"Peach","Banana","Apple"};
        Float[] f = {56f,30f,70f};
        new MaximumData<>(i).maxElement();
        new MaximumData<>(s).maxElement();
        new MaximumData<>(f).maxElement();
    }
    }
