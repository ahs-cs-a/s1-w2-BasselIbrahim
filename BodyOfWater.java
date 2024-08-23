public class BodyOfWater {
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int ld, int ad, boolean sw){
        name = n;
        largestDiameter = ld;
        avgDepth = ad;
        isSaltWater = sw;
    }

    public BodyOfWater(String n, int ad){
        name = n;
        avgDepth = ad;
    }
public String name(){
        return name;
    }
public int largestDiameter(){
        return largestDiameter;
    }
public int avgDepth(){
        return avgDepth;
    }
public boolean isSaltWater(){
        return isSaltWater;
    }
    public void setName(String n){
        name = n;
    }    
    public void setlargestDiameter(int ld){
        largestDiameter = ld;
    }
}