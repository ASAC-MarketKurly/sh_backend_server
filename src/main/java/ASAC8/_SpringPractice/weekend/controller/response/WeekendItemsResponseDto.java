package ASAC8._SpringPractice.weekend.controller.response;

import ASAC8._SpringPractice.item.WeekendItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class WeekendItemsResponseDto {
    private List<WeekendItem> weekendSpecialItems;
    private Integer totalCount;

    public static WeekendItemsResponseDto of(List<WeekendItem> weekendSpecialItems){
        return new WeekendItemsResponseDto(weekendSpecialItems, weekendSpecialItems.size());
    }
}
