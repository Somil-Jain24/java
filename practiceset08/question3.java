class square{
    int side;
    public void setside(int s){
        side = s;
    }
    public void area(){
        System.out.println("Area of square is: " + side*side);
    }
    public void perimeter(){
        System.out.println("Perimeter of square is: " + 4*side);
    }
}

public class question3 {
    public static void main(String[] args) {
        square s = new square();
        s.setside(5);
        s.area();
        s.perimeter();
    }
}
