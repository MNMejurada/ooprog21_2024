public class MathTest {
    public static void main(String[] args) {
        System.out.println("SQRT: " + Math.sqrt(37));
        System.out.println("SIN: " + Math.sin(Math.toRadians(270))); 
        System.out.println("COS: " + Math.cos(Math.toRadians(270))); 
        System.out.println("FLOOR: " + Math.floor(22.8));
        System.out.println("CEIL: " + Math.ceil(22.2));
        System.out.println("ROUND: " + Math.round(22.5));
        System.out.println("MAX: " + Math.max(71, 68));
        System.out.println("MIN: " + Math.min(71, 68));
        System.out.println("RANDOM: " + (int)(Math.random() * 100)); 
}
