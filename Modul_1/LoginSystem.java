import java.util.Scanner;

public class LoginSystem {
    private final String namaBenar = "M Bagus Triyadi";
    private final String nimBenar = "202110370311347";
    private final String usernameBenar;
    private final String passwordBenar;
    private final Scanner scanner;

    public LoginSystem(Scanner scanner) {
        this.scanner = scanner;
        String tigaDigitNIM = nimBenar.substring(nimBenar.length() - 3);
        this.usernameBenar = "Admin" + tigaDigitNIM;
        this.passwordBenar = "Password" + tigaDigitNIM;
    }

    public void start() {
        System.out.println("=== SISTEM LOGIN ===");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            loginAdmin();
        } else if (pilihan == 2) {
            loginMahasiswa();
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    private void loginAdmin() {
        System.out.print("Masukkan Username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String passwordInput = scanner.nextLine();

        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private void loginMahasiswa() {
        System.out.print("Masukkan Nama: ");
        String namaInput = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nimInput = scanner.nextLine();

        if (namaInput.equals(namaBenar) && nimInput.equals(nimBenar)) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama: " + namaInput);
            System.out.println("NIM: " + nimInput);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}