package Task26;

public class Task26 {
    public static void main(String[] args) {
        Teapot teapot = new Teapot("Tefal",4,220,false,2.7,true);
        Fridge fridge = new Fridge("Minsk",6,220, false,-8,"AAA");
        if (!fridge.isOn()){
            fridge.setOn(false);
        }
        System.out.println(fridge.isOn());
    }
}
