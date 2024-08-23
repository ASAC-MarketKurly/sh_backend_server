package ASAC8._SpringPractice.closing.controller;

import ASAC8._SpringPractice.closing.controller.response.ClosingItemResponseDto;
import ASAC8._SpringPractice.closing.service.ClosingService;
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

    @GetMapping("/closing-sale")
    public ResponseEntity<ClosingItemResponseDto> getClosingItems(){
        ClosingItemResponseDto response = closingService.getClosing();

        return ResponseEntity
                .status(200)
                .body(response); //데이터


    }
}
