public class Sum {
    public static void main(String[] args) {
        double [] nilai = {80, 90, 75, 85, 95};
        double sum = 0;
        double avg;
        for (double n : nilai) {
            sum += n;
        }
        avg = sum / nilai.length;
        System.out.println("Jumlah: " + sum);
        System.out.println("Rata-rata: " + avg);
    }
}
