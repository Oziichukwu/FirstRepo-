public class AirConditionerTest {

public static void main( String[] args){

    
    
        // give that
        AirConditioner lgAirconditioner = new AirConditioner();

        // when
        lgAirconditioner.power(1);

        // assert that

        int lgController = lgAirconditioner.getController();

        System.out.println("AirConditioner is " + lgController);


    

    
    

        // given that
        AirConditioner lgAirconditioner = new AirConditioner();

            lgAirconditioner.power(1);

        // when

            lgAirconditioner.power(0);

        // check that

        int lgController = lgAirconditioner.getController();
        System.out.println("AirConditioner is " + lgController);
    

    
     

        // given that

        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.power(1);

        // when

        lgAirconditioner.increaseTemperature(20);

        // check that

        int lgController = lgAirconditioner.getController();
        System.out.println("Temperature is %d " + lgController);

    

    
    

        // given that

        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.power(1);

        lgAirconditioner.decreaseTemperature(20);

        // when

        lgAirconditioner.decreaseTemperature(20);

        // check that

        int lgController = lgAirconditioner.getController();
        System.out.println(" Temperature is %d " + lgController);

    

    
    

        // given that
        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.power(1);


        // when

        lgAirconditioner.increaseTemperature(35);

        // check that

        int lgController = lgAirconditioner.getController();
       System.out.println(" Temperature is %d " + lgController);


    


    
    
        //given that

        AirConditioner lgAirconditioner = new AirConditioner();

        lgAirconditioner.power(1);


        // when

        lgAirconditioner.decreaseTemperature(10);

        // check that

        int lgController = lgAirconditioner.getController();
        System.out.println(" Temperature is %d " + lgController);
        
    
	
   }	
    
}
