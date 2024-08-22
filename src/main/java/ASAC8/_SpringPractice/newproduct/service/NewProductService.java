package ASAC8._SpringPractice.newproduct.service;

import ASAC8._SpringPractice.item.Item;
import ASAC8._SpringPractice.item.ItemRepository;
import ASAC8._SpringPractice.item.NewProductItemResponseDto;
import ASAC8._SpringPractice.newproduct.controller.response.NewProductItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NewProductService {

    private final ItemRepository itemRepository;

    public NewProductItemResponse getNewProduct(){
        List<Item> items = itemRepository.getAllItems();         // 모든 Item 객체를 가져옵니다
        List<Item> newProductItems = items.stream()                  // stream API 를 사용해서
                .filter(item -> item.getIsNew() && item.getIsBestSeller())    // isNew 와 isBestSeller 가 true 인 Item 만 필터링합니다
                .toList();
//              .filter((item)->{
//                  return item.getIsNew();
//              })

        List<NewProductItemResponseDto> response = newProductItems.stream()    // 필터링된 Item 객체들을 NewProductItemResponseDto 로 변환합니다
                .map(NewProductItemResponseDto::of)                        // Item 객체를 받아 NewProductItemResponseDto 객체로 변환하는 정적 팩토리 메서드 입니다
                .toList();
//              .map((item)-> {
//                  return NewProductItemResponseDto.of(item)
//              })
        NewProductItemResponse newProductItemResponse = NewProductItemResponse.of(response);  //body에서 가공한것을 서비스 로직으로 뺌

        return newProductItemResponse;
    }
}
