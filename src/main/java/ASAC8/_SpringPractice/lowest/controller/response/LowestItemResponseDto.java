package ASAC8._SpringPractice.lowest.controller.response;

import ASAC8._SpringPractice.item.LowestItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access= AccessLevel.PRIVATE)
public class LowestItemResponseDto {
    private List<LowestItem> lowestPriceItems;
    private Integer totalCount;

    public static LowestItemResponseDto of(List<LowestItem> lowestPriceItems){
        return new LowestItemResponseDto(lowestPriceItems, lowestPriceItems.size());
    }
}
