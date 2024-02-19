package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception{
        //DaoImpl dao=new DaoImpl();
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();// => new DaoImpl()

        //MetierImpl metier =new MetierImpl();
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();// => new MetierImpl

        //metier.setDao(dao);  // Statique
        Method setDao= cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao); // Injection des dependances
        System.out.println("res="+metier.calcul());
    }
}
