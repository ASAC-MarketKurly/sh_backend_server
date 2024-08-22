package ASAC8._SpringPractice.closing.controller;

import ASAC8._SpringPractice.closing.controller.response.ClosingItemResponse;
import ASAC8._SpringPractice.closing.service.ClosingService;
import ASAC8._SpringPractice.item.ClosingItemResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main/api")
@RestController
@RequiredArgsConstructor
public class ClosingController {

    private final ClosingService closingService;  // ClosingService 클래스 빈 주입 !

    @GetMapping("/closingSaleItems")
    public ResponseEntity<ClosingItemResponseDto> getClosingItems(){
        ClosingItemResponse response = closingService.getClosing();

        return ResponseEntity
                .status(200)
                .body(response);


    }
}
