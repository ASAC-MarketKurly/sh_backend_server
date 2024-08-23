package ASAC8._SpringPractice.closing.service;

import ASAC8._SpringPractice.closing.controller.response.ClosingItemResponseDto;
import ASAC8._SpringPractice.item.ClosingItem;
import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClosingService {

    private final ItemRepository itemRepository;

    public ClosingItemResponseDto getClosing() {
        List<Item> items = itemRepository.getAllItems();
        List<Item> closingItems = items.stream()
                .filter(item -> item.getDiscountRate() >= 30) // discountRate 가 30 이상인 항목 필터링
                .toList(); // 결과를 리스트로 수집

        List<ClosingItem> response = closingItems.stream()  // 필터링된 Item 객체들을 ClosingResponseDto 로 변환합니다     // closingItem 이어야한다
                .map(ClosingItem::of)                       // 아이템에 있는 값중 필요한것만 노출하려고
                .toList();

        ClosingItemResponseDto closingItemResponseDto = ClosingItemResponseDto.of(response);  // responseDto 이어야하고     함수에서 함수로 반환할때 dto

        return closingItemResponseDto;
    }
}
