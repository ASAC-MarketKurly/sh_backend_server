package ASAC8._SpringPractice.lowest.service;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.LowestItem;
import ASAC8._SpringPractice.lowest.controller.response.LowestItemResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LowestService {

    private final ItemRepository itemRepository;

    public LowestItemResponseDto getLowest(){
        List<Item> items = itemRepository.getAllItems();
        List<Item> lowestItems = items.stream()
                .filter(Item::getIsLowestPrice)
                .toList();

        List<LowestItem> response = lowestItems.stream()
                .map(LowestItem::of)
                .toList();

//        LowestItemResponseDto lowestItemResponseDto = LowestItemResponseDto.of(response);
//
//        return lowestItemResponseDto;
        return LowestItemResponseDto.of(response);

    }
}
