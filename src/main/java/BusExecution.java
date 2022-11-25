public class BusExecution {
    public static void main(String[] args) {
        Bus myBus1 = new Bus(1);
        Bus myBus2 = new Bus(2);

        if(myBus1.Num != myBus2.Num){
            System.out.println("myBus1과 myBus2의 번호는 다릅니다");
        }

        myBus1.takePassenger();
        myBus1.takePassenger();
        int result0 = myBus1.checkPassenger();
        System.out.println("탑승 승객 수 = " + result0);
        System.out.println("잔여 승객 수 = " + myBus1.remainedPassenger);
        System.out.println("요금 확인 = " + myBus1.presentPassenger* myBus1.fee);

        int result1 = myBus1.changeGas(-50);
        System.out.println("주유량 = " + result1);

        myBus1.changeStatus();
        int result2 = myBus1.changeGas(10);
        System.out.println("상태 = " + myBus1.presentStatus);
        System.out.println("주유량 = " + result2);
        myBus1.changeStatus();
        myBus1.checkPassenger(45);

        myBus1.takePassenger();
        myBus1.takePassenger();
        myBus1.takePassenger();
        myBus1.takePassenger();
        myBus1.takePassenger();
        int result3 = myBus1.checkPassenger();
        System.out.println("탑승 승객 수 = " + result3);
        System.out.println("잔여 승객 수 = " + myBus1.remainedPassenger);
        System.out.println("요금 확인 = " + myBus1.presentPassenger* myBus1.fee);

        int result4 = myBus1.changeGas(-55);
        String result5 = myBus1.changeStatus(result4);
        System.out.println("주유량 = " + result4);
        System.out.println("상태 = " + result5);
        if(result4 < 10) {
            System.out.println("'주유 필요'");
        }

        //추가확인//
        myBus1.changeSpeed(5);
        int result6 = myBus1.changeSpeed(20);
        System.out.println("현재 속도 : " + result6);

    }
}
