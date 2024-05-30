public class dragonMain {
    public static void main(String[] args) {
        dragon console = new dragon(2,5,5,10);
        console.detectCollision();
        console.moveRight();
        console.printPosition();
        console.moveUp();
        console.printPosition();
        console.moveLeft();
        console.printPosition();
        console.moveLeft();
        console.printPosition();
        console.moveLeft();
        console.printPosition();
    }
    
}