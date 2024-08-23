package ASAC8._SpringPractice.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MainItem {
    private Integer id;
    private String title;
    private String imageUrl;

    public static MainItem of(Item item){
        return new MainItem(
                item.getId(),
                item.getTitle(),
                item.getImageUrl()
        );
    }
}
