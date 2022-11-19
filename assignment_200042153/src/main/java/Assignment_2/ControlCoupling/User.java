package Assignment_2.ControlCoupling;

public class User {
    //here which methode of house class will be called depends on inner condition, therefor, it's control coupling
    public void order(house House, String request){
        if(request=="sell"){
            House.sell();
        } else if (request=="rent") {
            House.rent();
        }
    }
}
