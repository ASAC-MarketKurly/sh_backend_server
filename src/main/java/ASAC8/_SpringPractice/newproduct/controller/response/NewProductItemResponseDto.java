package ASAC8._SpringPractice.newproduct.controller.response;

import ASAC8._SpringPractice.item.NewProductItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NewProductItemResponseDto {    // item 에 있는 JSON 데이터를 가공하기 위한 클래스
    private List<NewProductItem> approvedNewProducts;
    private int totalCount;

    public static NewProductItemResponseDto of(List<NewProductItem> approvedNewProducts){   // 정적 팩토리 메서드
        return new NewProductItemResponseDto(approvedNewProducts,approvedNewProducts.size());   // 매개변수는 공통될수있으니 최소화
    }
}
