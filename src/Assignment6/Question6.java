package Assignment6;

public class Question6 {
    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> {
                System.out.println("Logging: Order has been cancelled.");
                yield "Order has been canceled.";
            }
            case REFUNDED -> {
                System.out.println("Logging: Refund processed.");
                yield "Refund has been issued for the order.";
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(processOrderStatus(OrderStatus.PENDING));
        System.out.println(processOrderStatus(OrderStatus.CANCELLED));
        System.out.println(processOrderStatus(OrderStatus.REFUNDED));
    }
}

