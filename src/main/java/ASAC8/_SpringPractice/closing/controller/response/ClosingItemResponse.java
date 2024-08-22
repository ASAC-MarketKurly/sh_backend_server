package ASAC8._SpringPractice.closing.controller.response;

import ASAC8._SpringPractice.item.ClosingItemResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ClosingItemResponse { //item 에 있는 JSON 데이터를 가공하기 위한 클래스
    private List<ClosingItemResponseDto>closingSaleItems;
    private Integer totalCount;

    public static ClosingItemResponse of(List<ClosingItemResponseDto> closingSaleItems){
        return new ClosingItemResponse(closingSaleItems, closingSaleItems.size());
    }
}
