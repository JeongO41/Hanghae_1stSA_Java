public class Bus extends Transport{


    String presentStatus ;
    //생성자
    Bus(){};

    Bus(int Num){
        this.maxPassenger = 30;
        this.fee = 1000;
        this.Num = Num;
        this.presentStatus = "운행";
    }

    //메서드
    int[] presentPassenger1(int passenger){
        this.presentPassenger = 26;
        this.presentPassenger += passenger;
        return new int[]{passenger, presentPassenger, fee*passenger};
    }

    int[] presentPassenger2(int passenger){
        this.presentPassenger = 20;
        this.presentPassenger += passenger;
        return new int[]{passenger, presentPassenger, fee*passenger};
    }

//    void checkPassenger(int passenger){
//        this.presentPassenger += passenger;
//        if(presentPassenger > maxPassenger){
//            System.out.println("'최대 승객 수 초과'");
//        }
//    }


    int changeGas(int gas){
        this.presentGas += gas;
        return presentGas;
    }

    String changeStatus(){
        if(presentStatus == "운행"){
            presentStatus = "차고지행";
        }else{
            presentStatus = "운행";
        } return presentStatus;
    }

    String changeStatus(int gas){
        this.presentGas = gas;
        if(presentGas < 10){
            this.presentStatus = "차고지행";
        }return presentStatus;
    }


    int changeSpeed(int speed){
        this.presentSpeed += speed;
        if(presentGas < 10){
            System.out.println("주유량을 확인해 주세요");
        }
        return presentSpeed;
    }






    //메서드
//    void setGas(int gas){
//        this.gas += gas;
//        System.out.println("주유량 : " + gas);
//    }
//
//    boolean isLeftGas(){
//        if(gas < 10) {
//            System.out.println("주유가 필요합니다");
//            return false;
//        }else{
//            return true;
//    }
//
//    void changeStatus(boolean status){           //change
//            if(true) {
//                presentStatus = "운행";
//
//            }else{
//                presentStatus = "차고지행";
//            }
//    }
//
//    void takePassenger(int passenger){
//            passengerCount += passenger;
//        if(passengerCount < maxPassenger){
//            System.out.println("탑승 승객 수 = " + passenger );
//            System.out.println("잔여 승객 수= " + passengerCount);
//            System.out.println("요금 확인 = " + fee*passenger);
//        }else{
//            System.out.println("최대 승객 수 초과");   //알럿으로??
//        }
//    }

//    void setSpeed(int speed){
//        speedStatus = speed;
//    }


    }


