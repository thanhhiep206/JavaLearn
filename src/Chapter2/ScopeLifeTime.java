package Chapter2;

public class ScopeLifeTime {
    public static void main(String[] args) {
        ScopeDemo scoped = new ScopeDemo();
        scoped.scope();
        LifeTimeDemo lifeTime = new LifeTimeDemo();
        System.out.println();
        lifeTime.lifeTime();
    }
}

class LifeTimeDemo {
    public void lifeTime() {
        int x;
        for(x = 0; x < 3; x++){
            int y = -1; // y will init each time loop in block
            System.out.println("y is: " + y);
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}

class ScopeDemo {
    public void scope() {
        int x; // x is read in main
        x = 10;
        if(x == 10){
            int y = 20; // y read only this block
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100
        // System.out.println("y is " + y); // y is not read
        System.out.println("x is " + x); // x still read hear
    }
}