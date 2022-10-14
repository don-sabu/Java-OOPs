// public keyword necessary anonnu ariyilla!!

// this is much more simple.. i think
public class shapes {
    double area ;

    void findarea(int R){
        float pi = 3.14;
        area = (float) pi * R * R;

        System.out.println("Area of Circle " + area);
    }

    
    void findarea(int L, int W){

        area = (float) L * W ;

        System.out.println("Area of Rectangle " + area);
    }
    
    void findarea(int B, double H){
        area = (float) B * H * 0.5 ;

        System.out.println("Area of Triangle " + area);
    }
}

public class shape_area_finder {
    public static void main (String[] args){
        shapes circle = new shapes();
        findarea(5);
    }
}