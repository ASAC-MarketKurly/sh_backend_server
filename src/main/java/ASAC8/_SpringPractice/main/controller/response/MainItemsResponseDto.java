package ASAC8._SpringPractice.main.controller.response;

import ASAC8._SpringPractice.item.MainItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MainItemsResponseDto {
    private List<MainItem> MainBannerSlider;

    public static MainItemsResponseDto of(List<MainItem> MainBannerSlider){
        return new MainItemsResponseDto(MainBannerSlider);
    }
}
