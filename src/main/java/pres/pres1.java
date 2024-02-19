package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();//instanciation statique
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);//injection des dependances
        System.out.println("res="+metier.calcul());
    }
}
