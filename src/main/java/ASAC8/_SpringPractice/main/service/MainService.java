package ASAC8._SpringPractice.main.service;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.MainItemResponseDto;
import ASAC8._SpringPractice.main.controller.response.MainItemsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {

    private final ItemRepository itemRepository;

    public MainItemsResponse getMain(){
        List<Item> items = itemRepository.getAllItems();
        List<MainItemResponseDto> response = items.stream()
                .map(MainItemResponseDto::of)
                .toList();

        MainItemsResponse mainItemsResponse = MainItemsResponse.of(response);

        return mainItemsResponse;
    }
}
