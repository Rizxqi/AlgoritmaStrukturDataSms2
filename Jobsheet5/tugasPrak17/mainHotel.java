package tugasPrak17;

public class mainHotel {

    
    public static void main(String[] args) {
        hotelService hotelService = new hotelService(10);

    // Menambahkan beberapa hotel ke dalam daftar
    hotelService.tambah(new hotel17("Hotel A", "Kota A", 150, (byte) 4));
    hotelService.tambah(new hotel17("Hotel B", "Kota B", 200, (byte) 3));
    hotelService.tambah(new hotel17("Hotel C", "Kota C", 100, (byte) 5));
    
    // Menampilkan daftar hotel sebelum diurutkan
    System.out.println("Daftar Hotel Sebelum Diurutkan:");
    hotel17[] daftarSebelumUrut = hotelService.getRooms();
    for (hotel17 hotel : daftarSebelumUrut) {
        if (hotel != null) {
            System.out.println(hotel.nama + " - $" + hotel.harga + " - " + hotel.bintang + " bintang");
        }
    }
    
    // Mengurutkan daftar hotel berdasarkan harga
    hotelService.bubbleSortByPrice();

    // Menampilkan daftar hotel setelah diurutkan
    System.out.println("\nDaftar Hotel Setelah Diurutkan Berdasarkan Harga:");
    hotel17[] daftarSetelahUrut = hotelService.getRooms();
    for (hotel17 hotel : daftarSetelahUrut) {
        if (hotel != null) {
            System.out.println(hotel.nama + " - $" + hotel.harga + " - " + hotel.bintang + " bintang");
        }
    }
}
}