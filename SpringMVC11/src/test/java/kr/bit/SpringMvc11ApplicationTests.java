package kr.bit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import kr.bit.entity.Member;
import kr.bit.entity.Role;
import kr.bit.repository.MemberRepository;

@SpringBootTest
class SpringMvc11ApplicationTests {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Test
	void createMember() {
		Member m=new Member();
		m.setUsername("lego");
		m.setPassword(encoder.encode("lego"));  // 암호화
		m.setName("김세형");
		m.setRole(Role.MANAGER);
		m.setEnabled(true);
		memberRepository.save(m); // 회원가입
		
		Member a=new Member();
		a.setUsername("guibuin67");
		a.setPassword(encoder.encode("guibuin67"));  // 암호화
		a.setName("김준수");
		a.setRole(Role.ADMIN);
		a.setEnabled(true);
		memberRepository.save(a); // 회원가입
		
		Member b=new Member();
		b.setUsername("guibuin");
		b.setPassword(encoder.encode("guibuin"));  // 암호화
		b.setName("박미정");
		b.setRole(Role.MEMBER);
		b.setEnabled(true);
		memberRepository.save(b); // 회원가입
		
		Member c=new Member();
		c.setUsername("lego5542");
		c.setPassword(encoder.encode("lego5542"));  // 암호화
		c.setName("김석봉");
		c.setRole(Role.MEMBER);
		c.setEnabled(true);
		memberRepository.save(c); // 회원가입
		
	}

}
