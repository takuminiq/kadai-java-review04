package animal;

import java.util.ArrayList;

public class Review04 {
    public static void main(String[] args) {
        Human tanaka=new Human("田中 太郎",25,"電車");
        Human suzuki=new Human("鈴木 次郎",30,"野球");
        Human sato=new Human("佐藤 花子",20,"映画");

        ArrayList<Human>Humans=new ArrayList<>();
        Humans.add(tanaka);
        Humans.add(suzuki);
        Humans.add(sato);

      for(Human human : Humans) {
          human.say();
          human.think();
      }
     }
}
