package ASAC8._SpringPractice.item;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LowestItem {
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

    public static LowestItem of(Item item){
        return new LowestItem(
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
