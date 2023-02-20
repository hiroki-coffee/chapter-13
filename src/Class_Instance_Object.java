public class Class_Instance_Object {
	private String name; // 名前
	private int age; // 年齢

	// コンストラクタ
	public Human(String name, int age) {
			this.name = name;
			this.age = age;
		}

	// 挨拶をするメソッド
	public void hello() {
		System.out.println("こんにちわ。私の名前は" + name + "です。" + age + "歳です");
	}

	public static void main(String[] args) {
		// 太郎インスタンスを生成
		Human taro = new Human("太郎", 24);
		taro.hello();
		// 花子インスタンスを生成
		Human hanako = new Human("花子", 30);
		hanako.hello();
	}
}