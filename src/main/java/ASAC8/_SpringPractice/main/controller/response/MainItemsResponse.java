package ASAC8._SpringPractice.main.controller.response;

import ASAC8._SpringPractice.item.MainItemResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MainItemsResponse {
    private List<MainItemResponseDto> MainBannerSlider;

    public static MainItemsResponse of(List<MainItemResponseDto> MainBannerSlider){
        return new MainItemsResponse(MainBannerSlider);
    }
}
