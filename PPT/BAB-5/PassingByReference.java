public class PassingByReference {
    public static void addAll(int[] numArray, int increment) {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] += increment;
        }
    }

    public static void main(String[] args) {
        int[] angkaGenap = { 2, 4, 6, 8, 10 };
        addAll(angkaGenap, 3);
        for (int i = 0; i < angkaGenap.length; i++) {
            System.out.println(angkaGenap[i]);
        }
    }
}
