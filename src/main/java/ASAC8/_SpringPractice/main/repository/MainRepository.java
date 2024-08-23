package ASAC8._SpringPractice.main.repository;

import ASAC8._SpringPractice.item.BannerItemRepository;
import ASAC8._SpringPractice.item.Item;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MainRepository implements Repository{

    private final BannerItemRepository bannerItemRepository;

    @Override
    public List<Item> getAllItems() {

        List<Item> itemList = bannerItemRepository.getBannerItemList();

        return itemList;
    }
}
