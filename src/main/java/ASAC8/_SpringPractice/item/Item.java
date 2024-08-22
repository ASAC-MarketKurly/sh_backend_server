package ASAC8._SpringPractice.item;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@AllArgsConstructor(access= AccessLevel.PRIVATE)
public class Item {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);  // 초기 값 설정 후 메서드를 호출 할때마다 1씩 증가시킨다
    private Integer id;
    private String title;
    private String description;
    private String imageUrl;
    private Integer originalPrice;
    private Integer salePrice;
    private Integer discountRate;
    private Integer reviewCount;
    private Double rating;
    private String category;
    private String brand;
    private List<String> tags;
    private Boolean isWeekendSpecial;
    private Boolean isBestSeller;
    private Boolean isNew;
    private Boolean isLowestPrice;

    public static Item of(          // 정적 팩토리 메서드 : 객체의 생성을 담당하는 클래스 메서드
                                    // 정적 팩토리 메서드의 장점 : 1. 이름을 가질 수 있다.
        String title,               //                       2. 호출 될 때마다 인스턴스를 새로 생성하지 않아도 된다.
        String description,         //                       3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
        String imageUrl,            //                       4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
        Integer originalPrice,      //                       5. 정적 팩토리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
        Integer salePrice,
        Integer discountRate,
        Integer reviewCount,
        Double rating,
        String category,
        String brand,
        List<String> tags,
        Boolean isWeekendSpecial,
        Boolean isBestSeller,
        Boolean isNew,
        Boolean isLowestPrice
    ) {
        Integer id = idGenerator.incrementAndGet();    // 기존에 선언된 id 변수에 값을 바로 할당
        return new Item(         // private 로 감춘 생성자를 생성해주는 메서드 이다.
                id,
                title,
                description,
                imageUrl,
                originalPrice,
                salePrice,
                discountRate,
                reviewCount,
                rating,
                category,
                brand,
                tags,
                isWeekendSpecial,
                isBestSeller,
                isNew,
                isLowestPrice
        );
    }

}
