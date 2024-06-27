package animal;

public class Animal {
    // フィールド
    private String name;
    private int age;
    
    // 引数なしコンストラクタ
    public Animal() {
    }
    
    // 引数ありコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // 出力（名前と年齢）
    public void say() {
        System.out.println(getName() + "です。" + getAge() + "歳です。");
    }
    
}
