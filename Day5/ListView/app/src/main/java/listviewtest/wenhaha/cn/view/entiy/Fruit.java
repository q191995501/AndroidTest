package listviewtest.wenhaha.cn.view.entiy;

/**
 * Created by Administrator on 2018/2/23 0023.
 */

public class Fruit {
    private String name ;
    private String imageId;

    public Fruit(String name, String imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
