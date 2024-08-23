public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Ocean", 25, 100, true);
        BodyOfWater b1 = new BodyOfWater("Lake", 30);
        BodyOfWater b2 = new BodyOfWater("CoolWater", 25, 110, true);

        
        System.out.println(b.name());
        System.out.println(b2.name());
        System.out.println(b.largestDiameter());
        System.out.println(b.avgDepth());
        System.out.println(b.isSaltWater());
        System.out.println(b1.name());
        System.out.println(b1.avgDepth());

    }
}
