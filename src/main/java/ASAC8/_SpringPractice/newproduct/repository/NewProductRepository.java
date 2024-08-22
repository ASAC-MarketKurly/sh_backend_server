package ASAC8._SpringPractice.newproduct.repository;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
public class NewProductRepository implements Repository{

    private final ItemRepository itemRepository;    // ItemRepository 클래스를 주입한다

    @Override
    public List<Item> getAllItems() {

        List<Item> itemList = itemRepository.getItemList();       //getItemList 를 사용하여 모든 객체를 불러온다

        return itemList;        // 불러온 객체 ( itemList ) 를 반환한다
    }
}
