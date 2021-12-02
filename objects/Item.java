package objects;

public class Item {
    public int atk;
    public int id;
    public String[] forges;

    public Item(int _id, String[] _forges) {
        id = _id;
        System.out.println("Created new item " + id);
    }
}
