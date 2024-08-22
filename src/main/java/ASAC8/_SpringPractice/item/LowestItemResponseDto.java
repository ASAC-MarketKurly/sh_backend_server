package ASAC8._SpringPractice.item;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LowestItemResponseDto {
    private Integer id;
    private String title;
    private String imageUrl;
    private String description;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private Boolean isLowestPrice;

    public static LowestItemResponseDto of(Item item){
        return new LowestItemResponseDto(
                item.getId(),
                item.getTitle(),
                item.getImageUrl(),
                item.getDescription(),
                item.getOriginalPrice(),
                item.getSalePrice(),
                item.getDiscountRate(),
                item.getReviewCount(),
                item.getRating(),
                item.getIsLowestPrice()
        );
    }
}
