public class ForEachArray {
    public static void main(String[] args) {
        String[] namaDosen = {"Pak Tri", "Pak Wiwid", "Bu Dany"};
        System.out.println("Isi Array For Each: ");
        for (String d : namaDosen) {
            System.out.println(d);
        }
        System.out.println("Isi Array For Loop:");
        for (int i = 1; i <  2; i++) {
            System.out.println(namaDosen[i]);
        }
    }
}
