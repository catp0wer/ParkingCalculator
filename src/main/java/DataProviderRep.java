import org.testng.annotations.DataProvider;


    public class DataProviderRep {


        @DataProvider(name="Data")
        public static Object[][] LogInCaseData(){
            return new Object[][]
                    {

                            { "Economy Parking","13:00","PM","4/11/2018","15:00","PM","4/11/2018","$ 8.00"},
                            { "Long-Term Surface Parking","08:00","AM","4/11/2018","21:00","PM","5/11/2018","$ 272.00"},
                            { "Long-Term Garage Parking","10:00","AM","4/11/2018","16:00","PM","6/11/2018","$ 648.00"},
                    };
        }
    }

