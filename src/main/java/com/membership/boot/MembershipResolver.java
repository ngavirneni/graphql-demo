package com.membership.boot;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.membership.dao.MembershipDAO;
import com.membership.model.Membership;


public class MembershipResolver implements GraphQLResolver<Membership> {


    public Membership getMemberInfo(int count) {
        return new MembershipDAO().findMember();
    }

}
