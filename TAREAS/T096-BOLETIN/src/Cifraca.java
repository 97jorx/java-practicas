public class Cifraca {

    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private int numero;



    public Cifraca(int numero){

    }

    public  String numero(int n) {


        switch(n){
            case 0:
                 s1 = "\u2b1b\u2b1b\u2b1b\u2b1b\u2b1b";
                 s2 = "\u2b1b\u2b1c\u2b1c\u2b1c\u2b1b";
                 s3 = "\u2b1b\u2b1c\u2b1c\u2b1c\u2b1b";
                 s4 = "\u2b1b\u2b1c\u2b1c\u2b1c\u2b1b";
                 s5 = "\u2b1b\u2b1b\u2b1b\u2b1b\u2b1b";
                return
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                assert false : "Error : error inesperado";
        }
        return null;
    }
    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }

    public String getS4() {
        return s4;
    }

    public String getS5() {
        return s5;
    }
    @Override
    public String toString() {
        return s1+""+s2+""+s3+""+s4+""+s5;
    }


}
