interface EngineStartable { void startEngine(); }
interface Refuelable      { void isiBahanBakar(); }
interface Chargeable      { void isiBaterai(); }
interface Pedalable       { void kayuh(); }

class GasCar implements EngineStartable, Refuelable {
    public void startEngine()   { System.out.println("Menyalakan mesin mobil bensin..."); }
    public void isiBahanBakar() { System.out.println("Mengisi bensin..."); }
}

class ElectricCar implements EngineStartable, Chargeable {
    public void startEngine() { System.out.println("Menyalakan motor listrik..."); }
    public void isiBaterai()  { System.out.println("Mengisi baterai kendaraan listrik..."); }
}

class Bicycle implements Pedalable {
    public void kayuh() { System.out.println("Sepeda dikayuh."); }
}

// Kendaraan baru tanpa mengubah kode lama
class Motorcycle implements EngineStartable, Refuelable {
    public void startEngine()   { System.out.println("Menyalakan mesin motor..."); }
    public void isiBahanBakar() { System.out.println("Mengisi bensin motor..."); }
}

class Main {
    static void nyalakan(EngineStartable v) {
        v.startEngine();
    }

    public static void main(String[] args) {
        ElectricCar mobilListrik = new ElectricCar();
        nyalakan(mobilListrik);
        mobilListrik.isiBaterai();

        Bicycle sepeda = new Bicycle();
        sepeda.kayuh();

        // nyalakan(sepeda); // error saat kompilasi, bukan runtime
    }
}

