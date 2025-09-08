public class IfString {
    public static void main(String[] args) {
        String prodi = "DTIF";

        if (prodi.equals("DTIF")) {
            System.out.println("Department Teknik Informatika");
        } else if (prodi.equals("DSI")) {
            System.out.println("Department Sistem Informasi");
        } else {
            System.out.println("Department Lain");
        }

        if (prodi.equalsIgnoreCase("dtif")) {
            System.out.println("Department Teknik Informatika");
        } else if (prodi.equalsIgnoreCase("dsi")) {
            System.out.println("Department Sistem Informasi");
        } else {
            System.out.println("Department Lain");
        }
    }
}