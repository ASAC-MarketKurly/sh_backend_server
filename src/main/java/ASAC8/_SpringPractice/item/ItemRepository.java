package ASAC8._SpringPractice.item;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

// 모든 상품데이터가 저장된 거대 저장소
@Getter
@Repository     // 클래스가 객체에대한 저장, 검색, 업데이트 및 삭제 작업을 위한 메커니즘을 제공할 때 사용합니다
public class ItemRepository {

//    public static <T> List<T> asList(T... a) {         asList 에 T를 담아준다 아래로직에선 Item !!
//        return new ArrayList<>(a);
//    }

    List<Item> itemList = Arrays.asList(  // Item 클래스를 List 형태로 itemList 라는 변수명으로 만들고 Arrays 클래스에 asList 로 담아주세요
            Item.of(

                    "퓨어 튜나 스틱 버라이어티팩 TT",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    true
            ),
            Item.of(

                    "애런 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),
            Item.of(

                    "바론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "싸론 튜나 스틱 버라이어티팩 TT",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    true
            ),Item.of(

                    "다론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "아론 튜나 스틱 버라이어티팩 TT",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    false
            ),Item.of(

                    "파론 튜나 스틱 버라이어티팩 TT",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    false
            ),Item.of(

                    "가론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "하론 튜나 스틱 버라이어티팩 TT",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    false
            ),Item.of(

                    "아론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "자론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "카론 튜나 스틱 버라이어티팩 TT",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    true,
                    true,
                    false
            ),Item.of(

                    "시론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "요론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            ),Item.of(

                    "여론 튜나 스틱 버라이어티팩",
                    "60개입 대용량 팩으로 즐기는 휴먼 그레이드 런치 스틱 간식",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3b416cbf-8d57-44b2-bcc6-e6d6c141160f.jpg",
                    30000,
                    20000,
                    33,
                    120,
                    4.5,
                    true,
                    false,
                    true,
                    false
            )
    );

    public List<Item> getAllItems() {     // 위에 저장한 itemList 를 반환하는 메서드 getAllItems 메서드 이름도 의미 있게 !
        return itemList;
    }
}
