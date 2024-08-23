package ASAC8._SpringPractice.weekend.service;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.WeekendItem;
import ASAC8._SpringPractice.weekend.controller.response.WeekendItemsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WeekendService {

    private final ItemRepository itemRepository;

    public WeekendItemsResponseDto getWeekend(){
        List<Item> items = itemRepository.getAllItems();
        List<Item> weekendItems = items.stream()
                .filter(item->item.getIsWeekendSpecial())
                .toList();

        List<WeekendItem> response = weekendItems.stream()
                .map(WeekendItem::of)
                .toList();

        WeekendItemsResponseDto weekendItemsResponseDto = WeekendItemsResponseDto.of(response);

        return weekendItemsResponseDto;
    }
}
