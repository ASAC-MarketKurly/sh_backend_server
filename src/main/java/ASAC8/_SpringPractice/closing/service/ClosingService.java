package ASAC8._SpringPractice.closing.service;

import ASAC8._SpringPractice.closing.controller.response.ClosingItemResponse;
import ASAC8._SpringPractice.item.ClosingItemResponseDto;
import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClosingService {

    private final ItemRepository itemRepository;

    public ClosingItemResponse getClosing() {
        List<Item> items = itemRepository.getAllItems();
        List<Item> closingItems = items.stream()
                .filter(item -> item.getDiscountRate() >= 30) // discountRate 가 30 이상인 항목 필터링
                .collect(Collectors.toList()); // 결과를 리스트로 수집

        List<ClosingItemResponseDto> response = closingItems.stream()  // 필터링된 Item 객체들을 ClosingResponseDto 로 변환합니다
                .map(ClosingItemResponseDto::of)
                .toList();

        ClosingItemResponse closingItemResponse = ClosingItemResponse.of(response);

        return closingItemResponse;
    }
}
