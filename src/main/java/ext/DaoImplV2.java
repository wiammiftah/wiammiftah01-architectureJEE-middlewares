package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version Web service");
        double data=55;
        return data;
    }

}
