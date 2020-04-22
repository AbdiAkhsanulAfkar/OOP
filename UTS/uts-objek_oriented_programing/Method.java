import java.util.LinkedList;
import java.util.List;

public class Method {

    private static List<data_mahasiswa> listData = new LinkedList<data_mahasiswa>();

   public static void tambah(data_mahasiswa data) {
       listData.add(data);
   }

   public static void ubah(data_mahasiswa data, int index) {
       listData.set(index, data);
   }

   public static void hapus(int index) {
       listData.remove(index);
   }

   public static List<data_mahasiswa> ambilList() {
       return listData;
   }
}
