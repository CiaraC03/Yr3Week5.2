package ie.atu.week5;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
    @FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
    public interface TodoClient {

        @GetMapping("/todos/1")
        List<TodoResponse> fetchData();

    }

