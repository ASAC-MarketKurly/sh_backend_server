package ASAC8._SpringPractice.weekend.repository;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class WeekendRepository implements Repository{

    private final ItemRepository itemRepository;
    @Override
    public List<Item> getAllItems() {

        List<Item> itemList = itemRepository.getItemList();

        return itemList;
    }
}
