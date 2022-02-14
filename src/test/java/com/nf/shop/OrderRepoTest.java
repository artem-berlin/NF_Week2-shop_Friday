//
//import com.nf.shop.Order;
//import com.nf.shop.OrderRepo;
//import com.nf.shop.Product;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class OrderRepoTest {
//    @Test
//    void ListshouldbeEqual() {
//
//        Product geige = new Product("1", "geige");
//        Product cello = new Product("2", "cello");
//        List<Product> products = new ArrayList<Product>();
//        products.add(geige);
//        products.add(cello);
//        List<Order> orderList = new ArrayList<Order>();
//        Order order1 = new Order("1", products);
//        orderList.add(order1);
//        OrderRepo allorders = new OrderRepo(orderList);
//
//
//        List actual = allorders.listOfOrders();
//
//        boolean check = orderList.equals(actual);
//        Assertions.assertTrue(check);
//
//    }
//}
