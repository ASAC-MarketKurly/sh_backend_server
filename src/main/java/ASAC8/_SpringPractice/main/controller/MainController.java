package ASAC8._SpringPractice.main.controller;

import ASAC8._SpringPractice.main.controller.response.MainItemsResponse;
import ASAC8._SpringPractice.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main/api")
@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("main-slider")
    public ResponseEntity<MainItemsResponse> getMainItems(){
        MainItemsResponse response = mainService.getMain();

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
