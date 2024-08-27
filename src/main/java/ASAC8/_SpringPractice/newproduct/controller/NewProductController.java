package ASAC8._SpringPractice.newproduct.controller;

import ASAC8._SpringPractice.newproduct.controller.response.NewProductItemResponseDto;
import ASAC8._SpringPractice.newproduct.service.NewProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main/api")
@RestController
@RequiredArgsConstructor
public class NewProductController {

    private final NewProductService newProductService;      // NewProductService 클래스 빈 주입 !

    @GetMapping("/approved-new-products")
    public ResponseEntity<NewProductItemResponseDto> getNewProductItems(){      // 상태값이랑 데이터를 보내주려고
        NewProductItemResponseDto response = newProductService.getNewProduct();

        return ResponseEntity                                       // 다양한 상태를 표현하기 위해 responseEntity 를 썼다
                                                                    // 상황(에러상황) 에따라 어떤 응답값이 다르다
                                                                    // 다양한 상태값의 해당되는 건 exceptionHandler 에 있습니다
                .status(200)                                        // 상태값, 데이터 두개를 보내준다
                .body(response);
    }
}
