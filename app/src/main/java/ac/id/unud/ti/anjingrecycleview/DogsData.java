package ac.id.unud.ti.anjingrecycleview;
import java.util.ArrayList; // Untuk ArrayList

public class DogsData {
    public static String[][] data = new String[][]{
            {"Siberian Husky", "Anjing dari Siberia, Russia", "https://upload.wikimedia.org/wikipedia/commons/f/ff/JAA_3538-2.jpg"},
            {"Welsh Corgi", "Anjing mini dari Welsh, Inggris", "https://upload.wikimedia.org/wikipedia/commons/2/2b/WelshCorgi.jpeg"}
    };

    public static ArrayList<Dogs> getListData(){
        Dogs dogs = null;
        ArrayList<Dogs> list = new ArrayList<>();
        for (String[] aData : data) {
            dogs = new Dogs();
            dogs.setName(aData[0]);
            dogs.setRemarks(aData[1]);
            dogs.setPhoto(aData[2]);

            list.add(dogs);
        }

        return list;
    }
}
