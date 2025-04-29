public class MyCircle {
    private Point oCircleCenter;
    private int iRadius;

    public MyCircle() {
        oCircleCenter = new Point(0, 0); // 기본 중심은 (0,0)
        iRadius = 1; // 반지름도 1로 기본 설정
    }


    public MyCircle(int x, int y, int iRadius) {
        oCircleCenter = new Point(x, y);
        this.iRadius = iRadius;
    }

    public int getCircleX() {
        return oCircleCenter.getX();
    }

    public int getCircleY() {
        return oCircleCenter.getY();
    }

    public int getRadius() {
        return iRadius;
    }
}
