package com.membership.boot;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.membership.dao.MembershipDAO;
import com.membership.model.Membership;


public class MembershipQueryResolver implements GraphQLQueryResolver {


    public Membership findPatient(int count) {
        return new MembershipDAO().findMember();
    }
}
