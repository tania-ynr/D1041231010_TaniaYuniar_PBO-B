public class latihanLogin {
    public static void main(String[] args) {

        // Username dan password yang benar
        String username = "admin";
        String password = "admin123";

        // Input login
        String inputUsername = "admin";
        String inputPassword = "admin";

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username : " + inputUsername);
        System.out.println("Password : ****");
        System.out.println("---------------------"); // garis pemisah

        // Cek username
        if (inputUsername.equals(username)) {
            System.out.println("Username valid");

            // Cek password
            if (inputPassword.equals(password)) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("selamat datang, admin");
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }

        } else {
            System.out.println("Username tidak valid!");
            System.out.println("LOGIN GAGAL!");
        }
    }
}