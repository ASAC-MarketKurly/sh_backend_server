package ASAC8._SpringPractice.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ClosingItem {
    private Integer id;
    private String title;
    private String imageUrl;
    private String description;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;


    public static ClosingItem of(Item item) {
        return new ClosingItem(
                item.getId(),
                item.getTitle(),
                item.getImageUrl(),
                item.getDescription(),
                item.getOriginalPrice(),
                item.getSalePrice(),
                item.getDiscountRate(),
                item.getReviewCount(),
                item.getRating()
        );
    }
}
