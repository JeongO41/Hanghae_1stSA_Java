public class Taxi extends Transport{
    int basicFee;
    int basicDistance;
    String destination;
    int destDistance;
    int unitFee;



    Taxi(){};

    Taxi(int Num){
        this.maxPassenger = 4;
        this.basicFee = 3000;
        this.unitFee = 1000;
        this.basicDistance = 1;
        this.Num = Num;
        this.presentStatus = "일반";
    }


    //메서드
    void destinationSet(String destination){
        this.destination = destination;
    }
    void setDestDistance(int distance){
        this.destDistance = distance;
    }

    int feeCalculation(int distance){
        fee = basicFee + (distance-1)*unitFee;
        return fee;
    }

    void takePassengerTaxi(){
        if(this.presentStatus == "일반"){
        this.passengerCount++;
        this.presentStatus = "운행 중";}
        else{
            System.out.println("탑승 불가");
        }
    }

    String checkGas(int gas){
        this.presentGas += gas;
        if(presentGas < 10){
            this.presentStatus = "운행불가";
        } return presentStatus;
    }
    void resetPassenger(){
        this.presentPassenger = 0;
    }






}
