package FlyWeightMode;

public abstract class BaseChess {
    public abstract String getColor();
    public void disPlay(Coordinates coord){
        System.out.println(String.format("棋子颜色为:{0},坐标为x:{1},y:{2}",this.getColor(),coord.getX(),coord.getY()));
    }
}
