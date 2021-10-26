import org.testng.annotations.*;

public class dataForDriven {
    @DataProvider(name = "DataMultipleInput")

    public Object[][] dataMulitpleInput()
    {
//        Object[][] data = new Object[2][3];
//
//        data[0][0] = "Fsix";
//        data[0][1] = "Lsix";
//        data[0][2] = 1;
//
//        data[1][0] = "Fseven";
//        data[1][1] = "Lseven";
//        data[1][2] = 3;
//        return data;
//    }
        //another method for DataProvider
        return new Object[][]
                {
                        {"Feight", "Leight", 2},
                        {"Fnine", "Lnine", 3},
                        {"Ften", "Lten", 1}
                };
    }

    @DataProvider(name = "DataToDelete")

    public Object[] dataToDelete() {

        return new Object[]{
                4,5,6

        };
    }
}
