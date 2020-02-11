public class Numeraco {

    private Cifraca cifraca1;
    private Cifraca cifraca2;
    private Cifraca cifraca3;

    public Numeraco(Cifraca cifraca1, Cifraca cifraca2, Cifraca cifraca3){
        this.cifraca1 = cifraca1;
        this.cifraca2 = cifraca2;
        this.cifraca3 = cifraca3;
    }

    @Override
    public String toString() {
        return  cifraca1.getS1()+ "" +cifraca2.getS1() + "" + cifraca3.getS1()+
                cifraca1.getS2()+ "" +cifraca2.getS2() + "" + cifraca3.getS2()+
                cifraca1.getS3()+ "" +cifraca2.getS3() + "" + cifraca3.getS3()+
                cifraca1.getS4()+ "" +cifraca2.getS4() + "" + cifraca3.getS4()+
                cifraca1.getS5()+ "" +cifraca2.getS5() + "" + cifraca3.getS5();



    }


}
