package SteramAPI.ScenarioBased;
import java.util.*;
import java.util.stream.Collectors;

class Order {
    String orderId;
    String userId;
    double amount;
    String status; // CREATED, PAID, CANCELLED

    public Order(String orderId, String userId, double amount, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public String getUserId() { return userId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
}


public class UserOrderService {

    /*
    *    Get total paid amount per user.

        Find top 3 users by total order amount.

        Check if any user has more than 5 cancelled orders.

        Return list of orderIds where amount > 10,000 and status = PAID.

        Group orders by status and count per status.

        Convert orders to Map<orderId, Order> safely (handle duplicates).
        *
        * */

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("O101", "U1", 12000, "PAID"),
                new Order("O102", "U1", 5000,  "PAID"),
                new Order("O103", "U1", 2000,  "CANCELLED"),

                new Order("O104", "U2", 15000, "PAID"),
                new Order("O105", "U2", 7000,  "PAID"),
                new Order("O106", "U2", 3000,  "CANCELLED"),
                new Order("O107", "U2", 4000,  "CANCELLED"),
                new Order("O108", "U2", 6000,  "CANCELLED"),
                new Order("O109", "U2", 8000,  "CANCELLED"),
                new Order("O110", "U2", 9000,  "CANCELLED"),

                new Order("O111", "U3", 25000, "PAID"),
                new Order("O112", "U3", 12000, "PAID"),
                new Order("O113", "U3", 1000,  "CREATED"),

                new Order("O114", "U4", 3000,  "CREATED"),
                new Order("O115", "U4", 4000,  "PAID"),

                // Duplicate orderId to test safe Map conversion
                new Order("O115", "U4", 4000,  "PAID")
        );


        //1 Get total paid amount per user.

        Map<String , Double> totalPaidByUsers = orders.stream()
                .collect(Collectors.groupingBy(
                        x -> x.getUserId() ,
                        Collectors.summingDouble( x -> x.getAmount())
                ));

        totalPaidByUsers.forEach(
                (x , y) ->
                        System.out.println("userId : " + x +" TotalAmount : " + y)
        );

        System.out.println("1.1 Get total paid amount per user where the status is paid or unpaid");

        //1.1 Get total paid amount per user where the status is paid or unpaid

        Map<String, Double> totalPaidByUserWithStatus =
                orders.stream()
                        .filter(order -> "PAID".equals(order.getStatus()))
                        .collect(Collectors.groupingBy(
                                Order::getUserId,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        totalPaidByUserWithStatus.forEach(
                (x , y) ->
                        System.out.println("userId : " + x +" TotalAmount : " + y)
        );

        // 2 Find top 3 users by total order amount.

        totalPaidByUsers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(3)
                .forEach(System.out::println);







    }

}
