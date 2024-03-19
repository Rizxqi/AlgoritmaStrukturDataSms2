public class RizqiDragon {

    private int x;
    private int y;
    private int width;
    private int height;

    public RizqiDragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Player Position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        RizqiDragon RizqiDragon = new RizqiDragon(0, 0, 0, 0);
        RizqiDragon.moveRight();
        RizqiDragon.printPosition();
        RizqiDragon.moveDown();
        RizqiDragon.printPosition();
        RizqiDragon.moveLeft();
        RizqiDragon.printPosition();
        RizqiDragon.moveUp();
        RizqiDragon.printPosition();
    }
}