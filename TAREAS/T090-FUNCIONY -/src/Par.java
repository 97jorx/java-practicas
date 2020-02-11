public class Par {

    private  int a;
    private  int b;

    private Par(int a , int b){
        this.a = a;
        this.b = b;


    }


    public Par funcionY(int y){
        for (int i = 0; i < 2 ; i++) {
            a =  y / getA();
            b =  y / getB();
            y = (2^a)*b;
        }
        return new Par(a,b);
    }



    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
