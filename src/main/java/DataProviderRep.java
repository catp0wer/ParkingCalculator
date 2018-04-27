import org.testng.annotations.DataProvider;


    public class DataProviderRep {


        @DataProvider(name="Data")
        public static Object[][] LogInCaseData(){
            return new Object[][]
                    {
                            { "Economy Parking","4/11/2018"},


                    };
        }
    }

