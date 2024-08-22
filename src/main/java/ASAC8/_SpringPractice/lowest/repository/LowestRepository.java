package ASAC8._SpringPractice.lowest.repository;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class LowestRepository implements Repository{

    private final ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {

        List<Item> lowestItemList = itemRepository.getAllItems();

        return lowestItemList;
    }
}
