import java.util.Scanner;

public class SmartVillageApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Aplikasi Smart Village");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Administrasi");
            System.out.println("2. Pelayanan Desa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu yang Anda inginkan: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (menu) {
                case 1:
                    AdministrasiMenu.administrasiMenu(scanner);
                    break;
                case 2:
                    LayananDesaMenu.layananDesaMenu(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan Aplikasi Smart Village.");
                    return;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }
    }
}

class AdministrasiMenu {
    public static void administrasiMenu(Scanner scanner) {
        System.out.println("Menu Administrasi:");
        System.out.println("1. Administrasi Umum");
        System.out.println("2. Administrasi Keuangan");
        System.out.println("3. Administrasi Kependudukan");
        System.out.print("Pilih jenis administrasi yang Anda inginkan: ");
        int administrasiMenu = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (administrasiMenu) {
            case 1:
                administrasiUmum(scanner);
                break;
            case 2:
                administrasiKeuangan(scanner);
                break;
            case 3:
                administrasiKependudukan(scanner);
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    private static void administrasiUmum(Scanner scanner) {
        System.out.println("Anda memilih Administrasi Umum");
        System.out.println("\nAdministrasi Umum:");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Administrasi Umum:");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);
    }

    private static void administrasiKeuangan(Scanner scanner) {
        System.out.println("Anda memilih Administrasi Keuangan");
        System.out.println("\nAdministrasi Keuangan:");
        System.out.print("Masukkan kebutuhan: ");
        String kebutuhan = scanner.nextLine();
        System.out.print("Masukkan total: ");
        double total = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan tanggal (DD/MM/YYYY): ");
        String tanggal = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Administrasi Keuangan:");
        System.out.println("Kebutuhan: " + kebutuhan);
        System.out.println("Total: " + total);
        System.out.println("Tanggal: " + tanggal);
    }

    private static void administrasiKependudukan(Scanner scanner) {
        System.out.println("Anda memilih Administrasi Kependudukan");
        System.out.println("\nAdministrasi Kependudukan:");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Administrasi Kependudukan:");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);
    }
}

class LayananDesaMenu {
    public static void layananDesaMenu(Scanner scanner) {
        System.out.println("\nMenu Pelayanan Desa:");
        System.out.println("1. Layanan Umum");
        System.out.println("2. Layanan Kependudukan");
        System.out.println("3. Layanan Pernikahan");
        System.out.println("4. Layanan Baru");
        System.out.print("Pilih jenis layanan desa yang Anda inginkan: ");
        int layananMenu = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (layananMenu) {
            case 1:
                layananUmum(scanner);
                break;
            case 2:
                layananKependudukan(scanner);
                break;
            case 3:
                layananPernikahan(scanner);
                break;
            case 4:
                layananBaru(scanner);
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    private static void layananUmum(Scanner scanner) {
        System.out.println("\nLayanan Umum:");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Layanan Umum:");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);
    }

    private static void layananKependudukan(Scanner scanner) {
        System.out.println("\nLayanan Kependudukan:");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Layanan Kependudukan:");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);
    }

    private static void layananPernikahan(Scanner scanner) {
        System.out.println("\nLayanan Pernikahan:");
        System.out.print("Masukkan nama pengantin pria: ");
        String namaPria = scanner.nextLine();
        System.out.print("Masukkan NIK pengantin pria: ");
        String nikPria = scanner.nextLine();
        System.out.print("Masukkan alamat pengantin pria: ");
        String alamatPria = scanner.nextLine();
        System.out.print("Masukkan nama pengantin wanita: ");
        String namaWanita = scanner.nextLine();
        System.out.print("Masukkan NIK pengantin wanita: ");
        String nikWanita = scanner.nextLine();
        System.out.print("Masukkan alamat pengantin wanita: ");
        String alamatWanita = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Layanan Pernikahan:");
        System.out.println("Nama Pengantin Pria: " + namaPria);
        System.out.println("NIK Pengantin Pria: " + nikPria);
        System.out.println("Alamat Pengantin Pria: " + alamatPria);
        System.out.println("Nama Pengantin Wanita: " + namaWanita);
        System.out.println("NIK Pengantin Wanita: " + nikWanita);
        System.out.println("Alamat Pengantin Wanita: " + alamatWanita);
    }

    // Metode untuk layanan baru yang menunjukkan Polymorphism
    private static void layananBaru(Scanner scanner) {
        System.out.println("\nLayanan Baru:");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("\nLaporan Layanan Baru:");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);
    }
}
