class cylinder{
        int radius;
        int height;
        public void setdata(int r , int h){
            radius = r;
             height = h;
        }
        public void getdata(){
           System.out.println(radius);
           System.out.println(height);
        }
        public void volume(){
            System.out.println(3.14*radius*radius*height);
        }

    }
public class question1 {
    
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setdata(50, 100);
        c.getdata();
        c.volume();
    }
}
