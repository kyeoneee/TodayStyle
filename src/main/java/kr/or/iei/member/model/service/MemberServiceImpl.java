package kr.or.iei.member.model.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kr.or.iei.member.model.dao.MemberDAO;
import kr.or.iei.member.model.vo.Member;



@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO mDAO;

	@Override
	public int insertMember(Member m) {
		return mDAO.insertMember(m);
	}

	@Override
	public Member selectLoginMember(Member member) {
		
		Member m =  mDAO.selectLoginMember(member);
		return m;
	}


	

	
	

	
	
}