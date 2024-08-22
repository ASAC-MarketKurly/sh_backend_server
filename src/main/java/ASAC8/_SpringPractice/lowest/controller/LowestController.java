package ASAC8._SpringPractice.lowest.controller;

import ASAC8._SpringPractice.lowest.controller.response.LowestItemResponse;
import ASAC8._SpringPractice.lowest.service.LowestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main/api")
@RequiredArgsConstructor
@RestController
public class LowestController {

    private final LowestService lowestService;

    @GetMapping("/lowest-price")
    public ResponseEntity<LowestItemResponse> getLowestItems(){
        LowestItemResponse response = lowestService.getLowest();

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
