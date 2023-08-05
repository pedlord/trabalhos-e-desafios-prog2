
public enum MarcasEnum {
	AMAZON, DELL, HP, TOSHIBA, LG, SAMSUNG;
}

class TestadoraEnum {
	public static void main(String[] args) {
		MarcasEnum hp = MarcasEnum.HP;
		MarcasEnum samsung = MarcasEnum. SAMSUNG;
		System.out.println("Nome da Marca1 = "+hp.name());
		System.out.println("Nome da Marca2 = "+samsung.name());
		System.out.println("Nome da Marca3 = "+MarcasEnum.HP);
	}
}