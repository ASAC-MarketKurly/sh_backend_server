package ASAC8._SpringPractice.weekend.service;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.WeekendItemResponseDto;
import ASAC8._SpringPractice.weekend.controller.response.WeekendItemsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WeekendService {

    private final ItemRepository itemRepository;

    public WeekendItemsResponse getWeekend(){
        List<Item> items = itemRepository.getAllItems();
        List<Item> weekendItems = items.stream()
                .filter(item->item.getIsWeekendSpecial())
                .toList();

        List<WeekendItemResponseDto> response = weekendItems.stream()
                .map(WeekendItemResponseDto::of)
                .toList();

        WeekendItemsResponse weekendItemsResponse = WeekendItemsResponse.of(response);

        return weekendItemsResponse;
    }
}
