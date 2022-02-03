public class KATZE{
    private int groesse;

    public KATZE(){
        groesse = 5;
        fressen();
    }
    
    public int getgroesse(){
        return groesse;
    }
    
    public void setgroesse(int wert){
        //groessse höchstens 5
        if(wert >= 4){
            //1. Fall
            groesse = wert;
        }else{
            //2. Fall
            groesse = 4;
        }
    }

    private void miauen(){
        System.out.println("Miau");
    }
    
    public void giblaut(){
        miauen();
    }
    
    private void fressen(){
        groesse = groesse + 1;
    }
}
