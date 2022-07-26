import java.util.ArrayList;

public class ArrayListTest{
    //Attributliste
    int[] testarray;
    ArrayList<Integer> testarraylist;        

    //Konstruktoren
    public ArrayListTest(){
        testarray = new int[200];
        testarraylist = new ArrayList<Integer>();
    }
    
    //Methoden
    public void main(){
        //Speicherplatz mit Index Nr 3 belegen mit der Zahl 2765
        testarray[3] = 2765;
        //Speicherplatz belegen mit der Zahl 2765
        testarraylist.add(2765);
        testarraylist.add(27);
        testarraylist.add(275);        
    }
    
    public void main2(){
        testarraylist.add(2765);
        testarraylist.add(27);
        testarraylist.add(275);        
        testarraylist.add(2765);
        testarraylist.add(27);
        testarraylist.add(275);    
        testarraylist.add(2765);
        testarraylist.add(27);
        testarraylist.add(275);            
    }    
}