import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static List<String> products = List.of("iPhone", "MacBook", "AirPods");

    @GetMapping
    public List<String> getAllProducts() {
        return products;
    }
}
