package animal;

public class Human extends Animal implements Thinkable {
    private String favorites;

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public Human () {
    }

    public Human(String name,int old,String favorites) {
        super(name,old);
        this.favorites=favorites;
    }

    @Override
    public void think() {
        System.out.println("私は"+favorites+"について考えています。");
    }









}
