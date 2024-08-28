public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Ocean", 25, 100, true);
        BodyOfWater b1 = new BodyOfWater("Lake", 30);
        //BodyOfWater b2 = new BodyOfWater("CoolWater", 25, 110, true);

        
        System.out.println(b.getName());
        //System.out.println(b2.name());
        System.out.println(b.getLargestDiameter());
        System.out.println(b.getAvgDepth());
        System.out.println(b.isSaltWater());
        System.out.println(b1.getName());
        System.out.println(b1.getAvgDepth());
        b1.setName("Lake Anza");
        System.out.println(b1.getName());
    }
}