class rectangle{
    int length;
    int width;
    public void setsides(int l, int w){
        length = l;
        width = w;
    }
    public void area(){
        System.out.println("Area of rectangle is: " + (length * width));
    }
    public void parame
}

public class question4 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setsides(5, 10);
        r.area();
    }
}
