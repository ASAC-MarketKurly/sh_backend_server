package ASAC8._SpringPractice.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MainItem {
    private Integer id;
    private String title;
    private String imageUrl;

    public static MainItem of(BannerItem bannerItem){
        return new MainItem(
                bannerItem.getId(),
                bannerItem.getTitle(),
                bannerItem.getImageUrl()
        );
    }
}
