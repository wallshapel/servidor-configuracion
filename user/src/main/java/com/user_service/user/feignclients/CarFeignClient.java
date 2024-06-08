package com.user_service.user.feignclients;

import com.user_service.user.models.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "car", url = "http://localhost:8081/api/v1/cars")
public interface CarFeignClient {

    @PostMapping()
    public Car store(@RequestBody Car car);

    @GetMapping("user/{userId}")
    public List<Car> getCars(@PathVariable("userId") Long userId);
}
