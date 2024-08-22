package ASAC8._SpringPractice.lowest.service;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.LowestItemResponseDto;
import ASAC8._SpringPractice.lowest.controller.response.LowestItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LowestService {

    private final ItemRepository itemRepository;

    public LowestItemResponse getLowest(){
        List<Item> items = itemRepository.getAllItems();
        List<Item> lowestItems = items.stream()
                .filter(item->item.getIsLowestPrice())
                .toList();

        List<LowestItemResponseDto> response = lowestItems.stream()
                .map(LowestItemResponseDto::of)
                .toList();

        LowestItemResponse lowestItemResponse = LowestItemResponse.of(response);

        return lowestItemResponse;

    }
}
