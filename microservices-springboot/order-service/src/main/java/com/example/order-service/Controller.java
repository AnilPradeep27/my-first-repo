import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static List<String> orders = new ArrayList<>();

    @PostMapping
    public String createOrder(@RequestParam String product) {
        orders.add(product);
        return "Order placed for " + product;
    }

    @GetMapping
    public List<String> getOrders() {
        return orders;
    }
}
