import java.util.zip.ZipEntry;

public class Transport {

    int Num;          //번호
    int presentGas = 100;             //주유량
    int presentSpeed = 0;         //현재 속도
    int maxPassenger;      //최대승객수
    int presentPassenger;       //현재승객수

    int remainedPassenger;    //잔여 승객 수

    int passengerCount;   //탑승한 승객수

    int fee ; //지불할 요금
    String presentStatus ;   //상태


    int changeGas(int gas){
        this.presentGas += gas;
        return presentGas;
    }

    int checkPassenger() {
        this.presentPassenger += passengerCount;
        if (presentPassenger > maxPassenger) {
            System.out.println("'최대 승객 수 초과'");

        } return presentPassenger;
    }

    int checkPassenger(int passenger) {
        this.presentPassenger += passenger;
        if (presentPassenger > maxPassenger) {
            System.out.println("'최대 승객 수 초과'");

        } return presentPassenger;
    }


    int remainedPassenger(){
        this.remainedPassenger = this.maxPassenger - this.presentPassenger;
        return remainedPassenger;
    }

    void takePassenger(){
        this.passengerCount++;
    }

    void resetPassengerCount(){
        this.passengerCount = 0;
    }

    void alert(){
        if(this.presentGas < 10){
            System.out.println("'주유 필요'");
        }
    }

}
