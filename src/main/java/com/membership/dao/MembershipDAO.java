package com.membership.dao;

import com.membership.model.Coverage;
import com.membership.model.Member;
import com.membership.model.Membership;

public class MembershipDAO {

    public Membership getCoverageInfo() {

        return loadMembership();
    }

    public Membership findMember() {

        return loadMembership();
    }

    private Membership loadMembership() {
        Membership mem = new Membership();
        mem.setCoverage(new Coverage());
        mem.getCoverage().setEffectiveEndDate("03/13/2018");
        mem.getCoverage().setEffectiveStartDate("03/13/2019");
        mem.setMember(new Member());
        mem.getMember().setFirstName("Sreeram");
        mem.getMember().setLastName("Gavirneni");
        mem.getMember().setGender("Male");
        return mem;
    }

}
