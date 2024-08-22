package ASAC8._SpringPractice.newproduct.controller;

import ASAC8._SpringPractice.newproduct.controller.response.NewProductItemsResponse;
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
    public ResponseEntity<NewProductItemsResponse> getNewProductItems(){      // 상태값이랑 데이터를 보내주려고
        NewProductItemsResponse response = newProductService.getNewProduct();

        return ResponseEntity
                .status(200)                                        // 상태값, 데이터 두개를 보내준다
                .body(response);
    }
}
