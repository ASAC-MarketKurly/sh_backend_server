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
public class BannerItem {
    private Integer id;
    private String title;
    private String imageUrl;

    public static BannerItem of(Item item) {
        return new BannerItem(
                item.getId(),
                item.getTitle(),
                item.getImageUrl()
        );
    }
}
