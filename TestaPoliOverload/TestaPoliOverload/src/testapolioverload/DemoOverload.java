package testapolioverload;
/**
 *
 * @author Victor Manuel - 1302
 */
public class DemoOverload {
    int x,y,z;
    
    public int soma(){
        return x+y;
    }

    public int soma(int x, int y){
        return x+y;
    }
    
    public int soma(int x, int y, int z){
        return x+y+z;
    }
    
    public int soma(int x,double y){
        return (int)(x+y);
    }
    
    public int soma(double x,int y){
        return (int)(x+y);
    }   
}
