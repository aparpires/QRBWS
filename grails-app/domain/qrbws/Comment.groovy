package qrbws

import grails.rest.Resource

@Resource(uri = '/api/comment', formats = ['json'])
class Comment {

    Integer avaliation
    String description
    Date dateCreated
    Boolean recommendation

    UserAccount userAccount
    Book book

    static constraints = {
        avaliation nullable: true, max: 5, validator: { if (it < 0) return ['comment.avaliation.negative'] }
        description nullable: true, maxSize: 500
        userAccount nullable: false
        book nullable: false
    }

    Comment() {
        recommendation = false
        avaliation = 0
    }
}
