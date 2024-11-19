package com.estsoft.springdemoproject.user.coupon;

// UserCouponTest 테스트코드에서 사용하는 인터페이스
public interface ICoupon {
    String getName();                // 쿠폰 이름
    boolean isValid();               // 쿠폰 유효 여부 확인
    int getDiscountPercent();        // 할인율
    boolean isAppliable(Item item);  // 해당 아이템에 적용 가능 여부
    void doExpire();                 // 사용할 수 없는 쿠폰으로 만듦
}
