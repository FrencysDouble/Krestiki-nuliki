package III;

public class TestDog {
    public static void main(String[] args)
    {
        Dog d1 = new Husky("Bonny","25 kg");
        System.out.println(d1.getName());
        System.out.println(d1.getMass());
        System.out.println(d1.getColour());
        System.out.println(d1.getMission());
    }
}
