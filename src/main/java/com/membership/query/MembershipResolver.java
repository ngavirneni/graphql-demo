package com.membership.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.membership.dao.MembershipDAO;
import com.membership.model.Membership;


public class MembershipResolver implements GraphQLResolver<Membership>{



        public Membership getMemberInfo(Membership membership) {
//            if(membership.get) {
//
//            }
            return new MembershipDAO().findMember();
        }

}
