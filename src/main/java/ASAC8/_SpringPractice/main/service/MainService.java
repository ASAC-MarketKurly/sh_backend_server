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

    public MainItemsResponseDto createMain (BannerItem bannerItem) {
        bannerItemRepository.addBannerItem(bannerItem);
        List<BannerItem> addBannerItems = bannerItemRepository.getAllItems();
        List<MainItem> response = addBannerItems.stream()
                .map(MainItem::of)
                .toList();

        return MainItemsResponseDto.of(response);
    }

    public MainItemsResponseDto getMain(){
        List<BannerItem> banneritems = bannerItemRepository.getAllItems();
        List<MainItem> response = banneritems.stream()
                .map(MainItem::of)
                .toList();

        return MainItemsResponseDto.of(response);
    }

    public BannerItem updateMain (Integer id, String title, String imageUrl) {
        BannerItem updateBannerItem = bannerItemRepository.updateBannerItem(id, title, imageUrl);

        return updateBannerItem;
    }

    public BannerItem deleteMain (Integer id) {
        BannerItem deleteBannerItem = bannerItemRepository.deleteBannerItem(id);

        return deleteBannerItem;
    }

    public MainItemsResponseDto clearMain () {
        bannerItemRepository.deleteAllBannerItem();
        List<BannerItem> clearBannerItems = bannerItemRepository.getAllItems();
        List<MainItem> response = clearBannerItems.stream()
                .map(MainItem::of)
                .toList();

        return MainItemsResponseDto.of(response);
    }
}
