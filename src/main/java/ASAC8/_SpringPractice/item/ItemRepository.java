package ASAC8._SpringPractice.item;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
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
                    "[사미헌] 갈비탕",
                    "진짜 갈비로 우려낸 전통 갈비탕",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/c4d41015-d188-4c68-b3e9-36968bf2110a.jpeg",
                    13000,
                    11050,
                    33,
                    120,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    false,
                    false
            ),
            Item.of(
                    "[풀무원] 정통 된장찌개 양념 450g",
                    "구수하고 담백한 감칠맛",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/7f86551d-a8cc-476b-b760-b7689213df2c.jpg",
                    6600,
                    3340,
                    50,
                    68,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("양념","고기와함께","100년전통"),
                    false,
                    true,
                    true,
                    false
            ),
            Item.of(
                    "[대상웰라이프] 마이밀 퓨로틴 초코맛 식물성 단백질 음료 24입",
                    "달콤하면서도 든든한",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/fcd9598c-4724-4f5c-a916-abcacb3c8636.jpg",
                    69000,
                    34900,
                    49,
                    166,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    false,
                    true,
                    false
            ),Item.of(
                    "[KF365] 한돈 삼겹살 구이용 600g~ (냉장)",
                    "미리 구비하는 인기 부위",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/396d26eb-4cdc-4291-9520-68e2a14e8c8c.jpg",
                    17950,
                    14100,
                    21,
                    37,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("육류","단백질","캠핑용"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[다향오리] 훈제오리 슬라이스 (1입/3입)",
                    "안심하고 즐기는 쫄깃한 식감",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/84ab6c67-888e-4f02-81dc-d1f736f9f7dd.jpg",
                    5390,
                    2695,
                    50,
                    233,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    true,
                    false,
                    true,
                    false
            ),Item.of(
                    "[달롤X갤러리밥스] 초당옥수수크림 롤케이크 2종(택1)",
                    "톡톡 터지는 달콤함 (여름한정)",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/bcd17cdc-6963-4596-98e8-9a35d4251cc0.jpg",
                    7500,
                    5250,
                    31,
                    64,
                    4.5,
                    "그루밍",
                    "컬리",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[압구정주꾸미] 주꾸미 볶음 2종 (택1)",
                    "마늘의 감칠맛이 듬뿍",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/3df368c8-e124-4d06-a9e9-af4c10d01b53.jpeg?v=0531",
                    8900,
                    6900,
                    22,
                    82,
                    4.5,
                    "그루밍",
                    "컬리",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[푸드올로지] 터보 붐 워터 500ml x 6개입",
                    "상큼한 레몬라임맛 음료",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/cd5c20af-dc0e-4613-a36a-d863e900751d.jpg",
                    25000,
                    8900,
                    64,
                    45,
                    4.5,
                    "그루밍",
                    "컬리",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[천지양] 활력홍삼 15병",
                    "6년근 홍삼과 17가지 전통 원료를 담은",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/420c3ac3-adaa-4160-b82d-4ecdb6cd78b0.jpg",
                    85000,
                    37900,
                    55,
                    23,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[조인] 유정 메추리알 56개입",
                    "신선하게 활용하는 메추리알",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/98134365-40b1-4882-83cb-a528cc36fe44.jpg",
                    5990,
                    5390,
                    10,
                    310,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[북창동순두부] 곱창 순두부찌개",
                    "곱이 꽉 찬 소곱창이 쏙",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/f6c1c764-ca5b-4aa7-8282-f1414ea34838.jpg",
                    10900,
                    9265,
                    15,
                    82,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    false
            ),Item.of(
                    "[오뚜기] 라면사리 멀티 (110gX5)",
                    "언제 어디서나 활용도 만점 라면사리(110gx5개입)",
                    "https://img-cf.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/shop/data/goods/1582692733762l0.jpg",
                    1750,
                    1627,
                    7,
                    443,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    true,
                    true,
                    true
            ),Item.of(
                    "[메소드] 세탁세제 1.58L 비치세이지",
                    "해변에 온 듯한 상쾌하고 싱그러운 향",
                    "https://img-cf.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/shop/data/goods/1656895782410l0.jpg",
                    16900,
                    8920,
                    47,
                    263,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    true,
                    false,
                    true,
                    false
            ),Item.of(
                    "[켈로그] 컵시리얼 4종 골라담기 (택3)",
                    "가볍고 든든한 컵시리얼",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/ca7e7410-2673-425b-b993-47751f381374.jpg",
                    1600,
                    860,
                    46,
                    97,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    false,
                    false,
                    true
            ),Item.of(
                    "[Kurly's] R15 통밀 식빵",
                    "컬리가 자신있게 제안하는 데일리 통밀 식빵",
                    "https://product-image.kurly.com/hdims/resize/%5E%3E360x%3E468/cropcenter/360x468/quality/85/src/product/image/72acd8ee-2d96-48d4-bd76-75b0453ebdf6.jpg",
                    3980,
                    22,
                    22,
                    73,
                    4.5,
                    "그루밍",
                    "퓨리클린",
                    Arrays.asList("샴푸","저자극","고양이"),
                    false,
                    false,
                    false,
                    false
            )
    );

    public List<Item> getAllItems() {     // 위에 저장한 itemList 를 반환하는 메서드 getAllItems 메서드 이름도 의미 있게 !
        return itemList;
    }
}
