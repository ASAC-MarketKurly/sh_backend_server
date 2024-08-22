package ASAC8._SpringPractice.lowest.controller.response;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.LowestItemResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access= AccessLevel.PRIVATE)
public class LowestItemResponse {
    private List<LowestItemResponseDto> lowestPriceItems;
    private Integer totalCount;

    public static LowestItemResponse of(List<LowestItemResponseDto> lowestPriceItems){
        return new LowestItemResponse(lowestPriceItems, lowestPriceItems.size());
    }
}
