package ASAC8._SpringPractice.closing.controller.response;

import ASAC8._SpringPractice.item.ClosingItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ClosingItemResponseDto { //item 에 있는 JSON 데이터를 가공하기 위한 클래스
    private List<ClosingItem> closingSaleItems;
    private Integer totalCount;

    public static ClosingItemResponseDto of(List<ClosingItem> closingSaleItems){
        return new ClosingItemResponseDto(closingSaleItems, closingSaleItems.size());
    }
}
