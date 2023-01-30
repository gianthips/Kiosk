import java.util.HashMap;

public class Map {

    public static void ingrediantNumber() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "김"); map.put("2", "햄"); map.put("3", "당근"); map.put("4", "시금치"); map.put("5", "단무지");
        map.put("6", "참기름"); map.put("7", "식초"); map.put("8", "참깨"); map.put("9", "김치"); map.put("10", "참치");
        map.put("11", "마요네즈");
    }
    
    public static void ingrediantStringVar() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "laverSP"); map.put("2", "hamSP"); map.put("3", "carrotSP"); map.put("4", "spinachSP"); map.put("5", "dakuangSP");
        map.put("6", "sesameoilSP"); map.put("7", "vinegarSP"); map.put("8", "sesameSP"); map.put("9", "kimchiSP"); map.put("10", "tunaSP");
        map.put("11", "mayoSP");
    }

    public static void ingrediantPriceVar() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "laverP"); map.put("2", "hamP"); map.put("3", "carrotP"); map.put("4", "spinachP"); map.put("5", "dakuangP");
        map.put("6", "sesameoilP"); map.put("7", "vinegarP"); map.put("8", "sesameP"); map.put("9", "kimchiP"); map.put("10", "tunaP");
        map.put("11", "mayoP");
    }
    
}
