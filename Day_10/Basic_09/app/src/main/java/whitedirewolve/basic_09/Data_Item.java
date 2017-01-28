package whitedirewolve.basic_09;

/**
 * Created by juni on 27/01/17.
 */

public class Data_Item {
    private int id_img_a;
    private int id_img_b;
    private String description;

    public Data_Item(int id_img_a, int id_img_b, String description) {
        this.id_img_a = id_img_a;
        this.id_img_b = id_img_b;
        this.description = description;
    }

    public int getId_img_a() {
        return id_img_a;
    }

    public void setId_img_a(int id_img_a) {
        this.id_img_a = id_img_a;
    }

    public int getId_img_b() {
        return id_img_b;
    }

    public void setId_img_b(int id_img_b) {
        this.id_img_b = id_img_b;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
