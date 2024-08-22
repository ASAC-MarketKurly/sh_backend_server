package ASAC8._SpringPractice.closing.repository;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ClosingRepository implements Repository{

    private final ItemRepository itemRepository;  // 가공된 데이터 주입

    @Override
    public List<Item> getAllItems(){

        List<Item> closingItemList = itemRepository.getAllItems();

        return closingItemList;
    }
}
