package ASAC8._SpringPractice.item;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NewProductItem {                    // Item : 데이터 베이스 객체 ( 민감한 정보 가 있디. )
    private Integer id;                           // NewProductItemResponseDto : 반환할 객체  ( 민감한 정보 없이 전달할 정보만 노출 )
    private String title;
    private String imageUrl;
    private String description;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private String category;
    private String brand;
    private List<String> tags;
    private Boolean isBestSeller;
    private Boolean isNew;
    private Boolean isWeekendSpecial;
    private Boolean isLowestPrice;


    public static NewProductItem of(Item item) {
        return new NewProductItem(
                item.getId(),
                item.getTitle(),
                item.getImageUrl(),
                item.getDescription(),
                item.getOriginalPrice(),
                item.getSalePrice(),
                item.getDiscountRate(),
                item.getReviewCount(),
                item.getRating(),
                item.getCategory(),
                item.getBrand(),
                item.getTags(),
                item.getIsBestSeller(),
                item.getIsNew(),
                item.getIsWeekendSpecial(),
                item.getIsLowestPrice()
        );
    }
}
