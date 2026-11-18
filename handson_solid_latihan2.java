class GradeCalculator {
    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class ReportPrinter {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);
    }
}

interface GradeRepository {
    void simpan(String nama, double nilai);
}

class DatabaseGradeRepository implements GradeRepository {
    public void simpan(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        ReportPrinter printer = new ReportPrinter();
        GradeRepository repository = new DatabaseGradeRepository();

        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);
        printer.cetakLaporan("Andi", nilai);
        repository.simpan("Andi", nilai);
    }
}
