import java.util.*;
public class Exercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, prim=1, seg=1, terc;
        terc = prim+seg;
        System.out.print(prim+","+seg+","+terc);
        for(i=1;i<=13;i++){
            prim=seg;
            seg=terc;
            terc=prim+seg;
            System.out.print(","+terc);
        }
    }
}
