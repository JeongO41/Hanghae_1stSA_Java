public class TaxiExecution {
    public static void main(String[] args) {
        Taxi myTaxi1 = new Taxi(1);
        Taxi myTaxi2 = new Taxi(2);

        if (myTaxi1.Num != myTaxi2.Num) {
            System.out.println("myTaxi1과 myTaxi2의 번호는 다릅니다");
        }
        System.out.println("주유량 = " + myTaxi1.presentGas);
        System.out.println("상태 = " + myTaxi1.presentStatus);

        myTaxi1.takePassengerTaxi();
        myTaxi1.takePassengerTaxi();
        myTaxi1.destinationSet("서울역");
        myTaxi1.setDestDistance(2);
        int result0 = myTaxi1.feeCalculation(myTaxi1.destDistance);
        myTaxi1.checkPassenger();
        int result1 = myTaxi1.remainedPassenger();
        System.out.println("탑승 승객 수 = " + myTaxi1.passengerCount); //이상함
        System.out.println("잔여 승객 수 = " + result1);
        System.out.println("기본 요금 확인 = " + myTaxi1.basicFee);
        System.out.println("목적지 = " + myTaxi1.destination);
        System.out.println("목적지까지 거리 = " + myTaxi1.destDistance + "km");
        System.out.println("지불할 요금 = " + result0);
        System.out.println("상태 = " + myTaxi1.presentStatus);
        myTaxi1.changeGas(-80);
        System.out.println("주유량 : " + myTaxi1.presentGas);
        System.out.println("누적 요금 = " + result0);
//        myTaxi1.takePassengerTaxi();
//        myTaxi1.takePassengerTaxi();
//        myTaxi1.takePassengerTaxi();
//        myTaxi1.takePassengerTaxi();
        myTaxi1.takePassengerTaxi();
        myTaxi1.checkPassenger(5);


        myTaxi1.resetPassenger();


        myTaxi1.checkPassenger(3);
        myTaxi1.destinationSet("구로디지털단지역");
        myTaxi1.setDestDistance(12);
        int result2 = myTaxi1.feeCalculation(myTaxi1.destDistance);
        myTaxi1.resetPassengerCount();
        myTaxi1.checkPassenger();
        int result3 = myTaxi1.remainedPassenger();


        System.out.println("탑승 승객 수 = " + myTaxi1.presentPassenger); //이상함
        System.out.println("잔여 승객 수 = " + result3);
        System.out.println("기본 요금 확인 = " + myTaxi1.basicFee);
        System.out.println("목적지 = " + myTaxi1.destination);
        System.out.println("목적지까지 거리 = " + myTaxi1.destDistance + "km");
        System.out.println("지불할 요금 = " + result2);

        myTaxi1.checkGas(-20);
        System.out.println("주유량 = " + myTaxi1.presentGas);
        System.out.println("상태 = " + myTaxi1.presentStatus);
        System.out.println("누적 요금 = " + result0 + result2);
        myTaxi1.alert();



















    }
}
