package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration // 자동으로 빈 등록
@EnableJpaAuditing // 디비 데이터 저장 업데이트하면 위치에 있는 어노테이션들을 업로드해줌
public class JpaAuditingConfiguration {


}
