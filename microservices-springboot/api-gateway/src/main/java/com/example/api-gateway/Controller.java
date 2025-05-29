import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {
    
    @GetMapping("/gateway/products")
    public List<String> getProducts() {
        return new RestTemplate().getForObject("http://localhost:8081/products", List.class);
    }

    @GetMapping("/gateway/orders")
    public List<String> getOrders() {
        return new RestTemplate().getForObject("http://localhost:8082/orders", List.class);
    }

    @PostMapping("/gateway/orders")
    public String createOrder(@RequestParam String product) {
        return new RestTemplate().postForObject("http://localhost:8082/orders?product=" + product, null, String.class);
    }
}
