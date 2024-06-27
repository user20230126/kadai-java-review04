package animal;

public class Human extends Animal  implements Thinkable {
    // フィールド
    private String hobby;
    
    //getter
    public String getHobby() {
        return hobby;
    }
    
    // setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    // 引数なしコンストラクタ
    public Human() {
    }
    
    // 引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    
    @Override
    public void think() {
        System.out.println("私は" + getHobby() + "について考えています。");
    }

}
