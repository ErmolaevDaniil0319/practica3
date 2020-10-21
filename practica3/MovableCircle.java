package practica3;

public class MovableCircle extends MovablePoint implements Movable  {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y , int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y =y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
        // this.center = center;
    }

    @Override
    public void moveUp() {
        if (Check(this.xSpeed, this.ySpeed)) {
            center = new MovablePoint(this.x, this.y++, this.xSpeed, this.ySpeed);
        }else {
            return;
        }

    }

    @Override
    public void moveDown() {
        if (Check(this.xSpeed, this.ySpeed)) {
            center = new MovablePoint(this.x, this.y--, this.xSpeed, this.ySpeed);
        }else {
            return;
        }

    }

    @Override
    public void moveLeft() {
        if (Check(this.xSpeed, this.ySpeed)) {
            center = new MovablePoint(this.x--, this.y, this.xSpeed, this.ySpeed);
        }else {
            return;
        }

    }

    @Override
    public void moveRight() {
        if (Check(this.xSpeed, this.ySpeed)) {
            center = new MovablePoint(this.x++, this.y, this.xSpeed, this.ySpeed);

        } else {
            return;
        }
    }

    @Override
    public String toString(){
        return "MovableCircle";
    }
    public boolean Check(int xSpeed, int ySpeed){
        if(xSpeed == ySpeed){
            return true;
        }else {
            return false;
        }

    }
}
