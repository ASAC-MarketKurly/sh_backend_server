package ASAC8._SpringPractice.weekend.controller.response;

import ASAC8._SpringPractice.item.WeekendItemResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class WeekendItemsResponse {
    private List<WeekendItemResponseDto> weekendSpecialItems;
    private Integer totalCount;

    public static WeekendItemsResponse of(List<WeekendItemResponseDto> weekendSpecialItems){
        return new WeekendItemsResponse(weekendSpecialItems, weekendSpecialItems.size());
    }
}
