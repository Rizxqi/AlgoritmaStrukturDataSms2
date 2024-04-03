package tugasPrak17;

public class hotelService {
    hotel17[] rooms;
    int count;

    public hotelService(int capacity) {
        rooms = new hotel17[capacity];
        count = 0;
    }

    public void tambah(hotel17 H) {
        if (count < rooms.length) {
            rooms[count] = H;
            count++;
        } else {
            System.out.println("Daftar hotel sudah penuh");
        }
    }

    public void hapusAll() {
        rooms = new hotel17[rooms.length];
        count = 0;
    }

    public void bubbleSortByPrice() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    hotel17 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSortByRating() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    hotel17 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public hotel17[] getRooms() {
        return rooms;
    }
}