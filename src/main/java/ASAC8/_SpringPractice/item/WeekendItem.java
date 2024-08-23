package ASAC8._SpringPractice.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WeekendItem {
    private Integer id;
    private String title;
    private String description;
    private String imageUrl;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private Boolean isWeekendSpecial;

    public static WeekendItem of(Item item){
        return new WeekendItem(
                item.getId(),
                item.getTitle(),
                item.getDescription(),
                item.getImageUrl(),
                item.getOriginalPrice(),
                item.getSalePrice(),
                item.getDiscountRate(),
                item.getReviewCount(),
                item.getRating(),
                item.getIsWeekendSpecial()
        );
    }
}
