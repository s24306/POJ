package Zad3;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(float a){
        super.setA(a);
        super.setH(0);
    }

    @Override
    public float caluclateArea() {
        return (float) (((super.getA() * super.getA()) * Math.sqrt(3)) / 4);
    }
}
