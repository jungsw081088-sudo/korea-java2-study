package com.study._27_NestedClass.inner;

import lombok.*;

@Builder // 빌더패턴 적용
// @Getter @Setter // getter, setter 만들어준다
// @ToString // toString 오버라이딩
// @EqualsAndHashCode // equals, hasCode 오버라이딩
@AllArgsConstructor // 모든필드생성자
@NoArgsConstructor // 기본생성자
// @RequiredArgsConstructor // final 필드 생성자
@Data // getter,setter,toString,equals,hashCode,RequiredArgsConstructor
public class LombokUser {
    private String username;
    private String name;
    private String address;

    // maven으로 프로젝트 만든경우
    // 라이브러리 사용
    // maven repository에서 dependency 복사
    // pom.xml에 <dependencies> 태그를 만들어 안쪽에 붙혀넣기
}
