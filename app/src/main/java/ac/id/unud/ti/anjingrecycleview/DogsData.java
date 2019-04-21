package ac.id.unud.ti.anjingrecycleview;
import java.util.ArrayList; // Untuk ArrayList

public class DogsData {
    public static String[][] data = new String[][]{
            {"Siberian Husky", "Anjing dari Siberia, Russia", "https://upload.wikimedia.org/wikipedia/commons/f/ff/JAA_3538-2.jpg", "Siberian Husky adalah jenis anjing pekerja ukuran sedang yang berasal dari Asia Timur Laut. Trah ini milik keluarga genetik Spitz. Dengan pelatihan yang tepat, mereka membuat anjing seluncur besar. Ini dikenali oleh mantel ganda berbulu tebal, telinga segitiga tegak, dan tanda khas, dan lebih kecil dari anjing yang tampak sangat mirip, Alaskan Malamute."},
            {"Welsh Corgi", "Anjing mini dari Welsh, Inggris", "https://upload.wikimedia.org/wikipedia/commons/2/2b/WelshCorgi.jpeg", "Welsh Corgi, kadang-kadang dikenal sebagai hanya Corgi, adalah jenis kecil anjing penggembala yang berasal dari Wales, Inggris. Dua jenis yang berbeda diakui: Pembroke Welsh Corgi dan Cardigan Welsh Corgi."},
            {"Golden Retriever", "Anjing besar dari Scotland, Inggris", "https://upload.wikimedia.org/wikipedia/commons/f/f0/Goldensondika.jpg", "Golden Retriever adalah jenis anjing yang dibesarkan dalam jumlah besar sebagai anjing penembak untuk mengambil unggas air yang ditembakkan, seperti bebek dan burung buruan, selama pesta berburu dan menembak, dan diberi nama 'retriever' karena kemampuan mereka untuk mengambil permainan tembakan tanpa kerusakan (mulut lembut)"},
            {"German Shepherd", "Anjing besar dari Jerman", "https://upload.wikimedia.org/wikipedia/commons/0/0c/Deutscher_Sch%C3%A4ferhund-_portrait.JPG", "Anjing German Shepherd adalah salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut. Anjing ini relatif tidak memiliki variasi warna, yaitu coklat dengan variasi hitam."},
            {"Shiba Inu", "Anjing kecil dari Jepang", "https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", "Shiba Inu adalah yang terkecil dari enam jenis anjing asli spitz asli dan berbeda dari Jepang. Seekor anjing kecil, lincah yang sangat cocok dengan daerah pegunungan, Shiba Inu awalnya dibiakkan untuk berburu. Itu terlihat mirip dan sering keliru untuk ras anjing Jepang lainnya seperti Akita Inu atau Hokkaido, tetapi Shiba Inu adalah jenis yang berbeda dengan garis darah yang berbeda, temperamen dan ukuran yang lebih kecil daripada ras anjing Jepang lainnya."}
    };

    public static ArrayList<Dogs> getListData(){
        Dogs dogs = null;
        ArrayList<Dogs> list = new ArrayList<>();
        for (String[] aData : data) {
            dogs = new Dogs();
            dogs.setName(aData[0]);
            dogs.setRemarks(aData[1]);
            dogs.setPhoto(aData[2]);
            dogs.setDesc(aData[3]);

            list.add(dogs);
        }

        return list;
    }
}
