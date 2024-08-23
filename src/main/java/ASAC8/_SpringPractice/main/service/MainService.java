package ASAC8._SpringPractice.main.service;

import ASAC8._SpringPractice.item.BannerItemRepository;
import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.MainItem;
import ASAC8._SpringPractice.main.controller.response.MainItemsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {

    private final BannerItemRepository bannerItemRepository;

    public MainItemsResponseDto getMain(){
        List<Item> items = bannerItemRepository.getAllItems();
        List<MainItem> response = items.stream()
                .map(MainItem::of)
                .toList();

        MainItemsResponseDto mainItemsResponseDto = MainItemsResponseDto.of(response);

        return mainItemsResponseDto;
    }
}
