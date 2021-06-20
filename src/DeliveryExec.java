import java.time.Duration;

public class DeliveryExec {
    static DeliveryExec instance = new DeliveryExec();
    static Integer assignedDeliveryExec = 1;
    static DeliveryExecModel previousDeliveryExec = new DeliveryExecModel();
    static DeliveryExecModel deliveryList[];

    public void AllotDelivery (CustomerModel customer) {
        DeliveryExecModel currentDeliveryExec = new DeliveryExecModel();

        if (DeliveryExec.instance.previousDeliveryExec == null) {
            currentDeliveryExec.executiveName = "DE" + assignedDeliveryExec;
            DeliveryExec.instance.assignedDeliveryExec += 1;
            currentDeliveryExec.pickupTime = customer.orderTime.plusMinutes(15);
            currentDeliveryExec.deliveryTime = currentDeliveryExec.pickupTime.plusMinutes(30);
            currentDeliveryExec.restaurant = customer.restaurant;
            currentDeliveryExec.destinationPoint = customer.destinationPoint;
            currentDeliveryExec.deliveryCharge = 50;
        } else {
            if (previousDeliveryExec.)
            Duration duration = Duration.between(customer.orderTime, DeliveryExec.instance.previousDeliveryExec.pickupTime.minusMinutes(15));

            if (duration.toMinutes() > 15) {

            }
        }
    }
}
