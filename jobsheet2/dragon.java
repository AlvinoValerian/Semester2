public class dragon {
    int x, y, width, height;
    public dragon(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x > 0 && x < width) {
                x--; 
            }
        }
    

    void moveRight() {
        if (x > 0 && x < width) {
            x++;
        }
    }

    void moveUp() {
        if (y > 0 && y < height) {
            y++; 
        }
    }

    void moveDown() {
        if (y > 0 && y < height) {
            y--;
        }
    }

    void printPosition() {
        System.out.println("Letak Dragon: (" + x + ", " + y + ")");
        if (x >= width || y >= height || x == 0 || y == 0) {
            detectCollision();
            
        }
    }

    void detectCollision() {
        if (x == width || y == height || x == 0 || y == 0) {
            System.out.println("Game Over!");
            System.exit(0);
            
    }
}
}