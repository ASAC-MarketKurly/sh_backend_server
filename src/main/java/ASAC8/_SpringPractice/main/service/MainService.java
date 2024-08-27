package ASAC8._SpringPractice.main.service;

import ASAC8._SpringPractice.item.*;
import ASAC8._SpringPractice.main.controller.response.MainItemsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {

    private final BannerItemRepository bannerItemRepository;

    public MainItemsResponseDto getMain(){
        List<BannerItem> banneritems = bannerItemRepository.getAllItems();
        List<MainItem> response = banneritems.stream()
                .map(MainItem::of)
                .toList();

//        MainItemsResponseDto mainItemsResponseDto = MainItemsResponseDto.of(response);
//
//        return mainItemsResponseDto;
        return MainItemsResponseDto.of(response);
    }

//    public MainItemsResponseDto
}
