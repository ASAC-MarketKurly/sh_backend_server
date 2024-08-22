package ASAC8._SpringPractice.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MainItemResponseDto {
    private Integer id;
    private String title;
    private String imageUrl;

    public static MainItemResponseDto of(Item item){
        return new MainItemResponseDto(
                item.getId(),
                item.getTitle(),
                item.getImageUrl()
        );
    }
}
