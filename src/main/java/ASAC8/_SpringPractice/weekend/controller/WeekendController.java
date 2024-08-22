package ASAC8._SpringPractice.weekend.controller;

import ASAC8._SpringPractice.weekend.controller.response.WeekendItemsResponse;
import ASAC8._SpringPractice.weekend.service.WeekendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main/api")
@RestController
@RequiredArgsConstructor
public class WeekendController {

    private final WeekendService weekendService;

    @GetMapping("weekend-special")
    public ResponseEntity<WeekendItemsResponse> getWeekendItems(){
        WeekendItemsResponse response = weekendService.getWeekend();

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
