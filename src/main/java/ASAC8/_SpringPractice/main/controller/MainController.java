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

    @PostMapping("/add")
    public ResponseEntity<MainItemsResponseDto> postMainItems (@RequestBody BannerItem bannerItem) {

        MainItemsResponseDto response = mainService.createMain(bannerItem);

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @GetMapping("/main-slider")
    public ResponseEntity<MainItemsResponseDto> getMainItems (){
        MainItemsResponseDto response = mainService.getMain();

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @PutMapping("/main-slider/{id}")
    public BannerItem putMainItem (@PathVariable Integer id,
                                  @RequestParam String title,
                                  @RequestParam String imageUrl)
    {
        BannerItem bannerItem = mainService.updateMain(id, title, imageUrl);

        return bannerItem;
    }

    @DeleteMapping("/main-slider/{id}")
    public BannerItem deleteMainItem (@PathVariable Integer id)
    {
        BannerItem bannerItem = mainService.deleteMain(id);

        return bannerItem;
    }

    @DeleteMapping("/main-slider/clear")
    public ResponseEntity<MainItemsResponseDto> deleteAllMainItem (){
        MainItemsResponseDto response = mainService.clearMain();

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
