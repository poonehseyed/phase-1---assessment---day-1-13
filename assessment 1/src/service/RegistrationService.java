package service;

import model.Library;
import model.Member;

import java.time.LocalDate;
import java.util.UUID;

public class RegistrationService {

    private static Member member = new Member();

    public RegistrationService(){
        member.setId("1");
        member.setRegisterDate(LocalDate.now());
        member.setLibraryDetails(null);

    }

    public Member register(){
        Member newMember = new Member();
        newMember.setId(UUID.randomUUID().toString());
        newMember.setRegisterDate(LocalDate.now());
        return newMember;
    }


    public Member getMemberDetails(String id){
        if(member.getId().equals(id)){
            return member;
        }
        return register();
    }
}
