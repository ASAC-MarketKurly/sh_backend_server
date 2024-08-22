package ASAC8._SpringPractice.main.repository;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MainRepository implements Repository{

    private final ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {

        List<Item> itemList = itemRepository.getItemList();

        return itemList;
    }
}
