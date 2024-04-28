import java.util.Scanner;

public class SmartVillageApp {
    private static int reportIdCounter = 1; // Counter untuk ID laporan

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

    // Fungsi untuk menanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
    public static boolean askUser(Scanner scanner) {
        System.out.print("\nApakah Anda ingin kembali ke menu utama atau menghapus laporan? (kembali/hapus): ");
        String response = scanner.nextLine().toLowerCase();
        return response.equals("kembali");
    }

    // Fungsi untuk mengenerate ID laporan
    public static int generateReportId() {
        return reportIdCounter++;
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
        int reportId = SmartVillageApp.generateReportId();
        System.out.println("Anda memilih Administrasi Umum");
        System.out.println("\nAdministrasi Umum:");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan laporan
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("+      Laporan Administrasi Umum Desa Melati                +");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("| ID Laporan   | Nama         | NIK          | Alamat      |");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.printf("| %-12d | %-12s | %-12s | %-12s |\n", reportId, nama, nik, alamat);
        System.out.println("+--------------+--------------+--------------+--------------+");


        // Tanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
        if (!SmartVillageApp.askUser(scanner)) {
            System.out.println("Laporan dengan ID " + reportId + " berhasil dihapus.");
        }
    }

    private static void administrasiKeuangan(Scanner scanner) {
        int reportId = SmartVillageApp.generateReportId();
        System.out.println("Anda memilih Administrasi Keuangan");
        System.out.println("\nAdministrasi Keuangan:");
        System.out.print("Masukkan kebutuhan: ");
        String kebutuhan = scanner.nextLine();
        System.out.print("Masukkan total: ");
        double total = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan tanggal (DD/MM/YYYY): ");
        String tanggal = scanner.nextLine();

        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("+      Laporan Administrasi Keuangan Desa Melati            +");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("| ID Laporan   | Kebutuhan    | Total        | Tanggal      |");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.printf("| %-12d | %-12s | %-12s | %-12s |\n", reportId, kebutuhan, total, tanggal);
        System.out.println("+--------------+--------------+--------------+--------------+");

        // Tanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
        if (!SmartVillageApp.askUser(scanner)) {
            System.out.println("Laporan dengan ID " + reportId + " berhasil dihapus.");
        }
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
        int reportId = SmartVillageApp.generateReportId();
        System.out.println("\nLaporan Administrasi Kependudukan:");
        System.out.println("ID Laporan: " + reportId);
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);

        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("+      Laporan Administrasi Kependudukan Desa Melati        +");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("| ID Laporan   | Nama         | NIK          | Alamat       |");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.printf("| %-12d | %-12s | %-12s | %-12s |\n", reportId, nama, nik, alamat);
        System.out.println("+--------------+--------------+--------------+--------------+");

        // Tanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
        if (!SmartVillageApp.askUser(scanner)) {
            System.out.println("Laporan dengan ID " + reportId + " berhasil dihapus.");
        }
    }
}

class LayananDesaMenu {
    public static void layananDesaMenu(Scanner scanner) {
        System.out.println("\nMenu Pelayanan Desa:");
        System.out.println("1. Layanan Umum");
        System.out.println("2. Layanan Kependudukan");
        System.out.println("3. Layanan Pernikahan");
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
        int reportId = SmartVillageApp.generateReportId();
        System.out.println("\nLaporan Layanan Umum:");
        System.out.println("ID Laporan: " + reportId);
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);

        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("+          Laporan Layanan Umum Desa Melati                 +");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("| ID Laporan   | Nama         | NIK          | Alamat       |");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.printf("| %-12d | %-12s | %-12s | %-12s |\n", reportId, nama, nik, alamat);
        System.out.println("+--------------+--------------+--------------+--------------+");

        // Tanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
        if (!SmartVillageApp.askUser(scanner)) {
            System.out.println("Laporan dengan ID " + reportId + " berhasil dihapus.");
        }
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
        int reportId = SmartVillageApp.generateReportId();
        System.out.println("\nLaporan Layanan Kependudukan:");
        System.out.println("ID Laporan: " + reportId);
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Alamat: " + alamat);

        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("+      Laporan Layanan Kependudukan Desa Melati             +");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("| ID Laporan   | Nama         | NIK          | Alamat       |");
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.printf("| %-12d | %-12s | %-12s | %-12s |\n", reportId, nama, nik, alamat);
        System.out.println("+--------------+--------------+--------------+--------------+");

        // Tanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
        if (!SmartVillageApp.askUser(scanner)) {
            System.out.println("Laporan dengan ID " + reportId + " berhasil dihapus.");
        }
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
        int reportId = SmartVillageApp.generateReportId();
        System.out.println("\nLaporan Layanan Pernikahan:");
        System.out.println("ID Laporan: " + reportId);
        System.out.println("Nama Pengantin Pria: " + namaPria);
        System.out.println("NIK Pengantin Pria: " + nikPria);
        System.out.println("Alamat Pengantin Pria: " + alamatPria);
        System.out.println("Nama Pengantin Wanita: " + namaWanita);
        System.out.println("NIK Pengantin Wanita: " + nikWanita);
        System.out.println("Alamat Pengantin Wanita: " + alamatWanita);

        System.out.println("+--------------+----------------------------+---------------------------+------------------------------+------------------------------+-----------------------------+--------------------------------+");
        System.out.println("+                                                                                    Laporan Layanan Pernikahan Desa Melati                                                                          +");
        System.out.println("+--------------+----------------------------+---------------------------+------------------------------+------------------------------+-----------------------------+--------------------------------+");
        System.out.println("| ID Laporan   | Nama Pengantin Pria        | NIK Pengantin Pria        | Alamat Pengantin Pria        | Nama Pengantin Wanita        | NIK Pengantin Wanita        | Alamat Pengantin Wanita        |");
        System.out.println("+--------------+----------------------------+---------------------------+------------------------------+------------------------------+-----------------------------+--------------------------------+");
        System.out.printf("| %-12d | %-26s | %-25s | %-28s | %-28s | %-27s | %-30s |\n", reportId, namaPria, nikPria, alamatPria, namaWanita, nikWanita, alamatWanita);
        System.out.println("+--------------+----------------------------+---------------------------+------------------------------+------------------------------+-----------------------------+--------------------------------+");

        // Tanyakan user apakah ingin kembali ke menu utama atau menghapus laporan
        if (!SmartVillageApp.askUser(scanner)) {
            System.out.println("Laporan dengan ID " + reportId + " berhasil dihapus.");
        }
    }
}
