package ASAC8._SpringPractice.main.controller;

import ASAC8._SpringPractice.item.BannerItem;
import ASAC8._SpringPractice.main.controller.response.MainItemsResponseDto;
import ASAC8._SpringPractice.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/main/api")
@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("main-slider")
    public ResponseEntity<MainItemsResponseDto> getMainItems(){
        MainItemsResponseDto response = mainService.getMain();

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @PostMapping("/add")
    public ResponseEntity<MainItemsResponseDto> postMainItems(@RequestBody BannerItem bannerItem) {

        MainItemsResponseDto response = mainService.createMain(bannerItem);

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
